
package Ecommerce_project.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ecommerce",
                    "root",
                    "guna@2006"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
