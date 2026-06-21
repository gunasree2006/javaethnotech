package Ecommerce_project.DAO;



import java.sql.*;
        import Ecommerce_project.util.DBConnection;

public class OrderDAO {

    public void placeOrder(String email) {
        double total = 0;

        try (Connection con = DBConnection.getConnection()) {

            String totalSql =
                    "SELECT SUM(p.price*c.quantity) FROM cart c " +
                            "JOIN products p ON c.product_id=p.product_id WHERE c.user_email=?";
            PreparedStatement ps1 = con.prepareStatement(totalSql);
            ps1.setString(1, email);
            ResultSet rs = ps1.executeQuery();
            if (rs.next()) total = rs.getDouble(1);

            String orderSql =
                    "INSERT INTO orders(user_email,total_amount) VALUES(?,?)";
            PreparedStatement ps2 = con.prepareStatement(orderSql);
            ps2.setString(1, email);
            ps2.setDouble(2, total);
            ps2.executeUpdate();

            PreparedStatement ps3 =
                    con.prepareStatement("DELETE FROM cart WHERE user_email=?");
            ps3.setString(1, email);
            ps3.executeUpdate();

            System.out.println("Order placed | Total: ₹" + total);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}