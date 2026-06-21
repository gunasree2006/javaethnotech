package Ecommerce_project.DAO;


import java.sql.*;
        import Ecommerce_project.util.DBConnection;

public class CartDAO {

    public void addToCart(String email, int productId, int qty) {
        String sql = "INSERT INTO cart(user_email,product_id,quantity) VALUES(?,?,?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.setInt(2, productId);
            ps.setInt(3, qty);
            ps.executeUpdate();
            System.out.println("Added to cart");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewCart(String email) {
        String sql =
                "SELECT p.name,p.price,c.quantity FROM cart c " +
                        "JOIN products p ON c.product_id=p.product_id WHERE c.user_email=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            System.out.println("Product Price Quantity");
            while (rs.next()) {
                System.out.println(
                        rs.getString(1)+" "+
                                rs.getDouble(2)+" "+
                                rs.getInt(3)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}