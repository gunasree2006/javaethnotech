package Ecommerce_project.DAO;

import java.sql.*;
import Ecommerce_project.model.User;
import Ecommerce_project.util.DBConnection;

public class UserDAO {

    public void register(User user) {
        String sql = "INSERT INTO users(name,email,password) VALUES(?,?,?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.executeUpdate();

            System.out.println("User Registered Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean login(String email, String password) {
        String sql = "SELECT * FROM users WHERE email=? AND password=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}