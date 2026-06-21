package Ecommerce_project.DAO;



import java.sql.*;
import Ecommerce_project.util.DBConnection;

public class ProductDAO {

    public void viewProducts() {
        String sql = "SELECT * FROM products";
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement()) {

            ResultSet rs = st.executeQuery(sql);
            System.out.println("ID  Name  Price  Stock");
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1)+" "+
                                rs.getString(2)+" "+
                                rs.getDouble(3)+" "+
                                rs.getInt(4)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}