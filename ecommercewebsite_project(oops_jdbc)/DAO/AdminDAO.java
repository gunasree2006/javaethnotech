package Ecommerce_project.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Ecommerce_project.util.DBConnection;

public class AdminDAO {

    public boolean adminLogin(String username, String password) {

        String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            return rs.next(); // true if admin exists

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void addProduct(String name, double price, int stock) {
        String sql = "INSERT INTO products(name, price, stock) VALUES(?,?,?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setInt(3, stock);
            ps.executeUpdate();
            System.out.println("✅ Product Added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
