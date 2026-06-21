package Ecommerce_project.service;
import Ecommerce_project.DAO.*;
        import Ecommerce_project.model.User;
import java.util.Scanner;

public class EcommerceService {

    Scanner sc = new Scanner(System.in);
    UserDAO userDAO = new UserDAO();
    ProductDAO productDAO = new ProductDAO();
    CartDAO cartDAO = new CartDAO();
    OrderDAO orderDAO = new OrderDAO();
    AdminDAO adminDAO = new AdminDAO();

    String email;

    public void registerUser() {
        User u = new User();
        System.out.print("Name: ");
        u.setName(sc.next());
        System.out.print("Email: ");
        u.setEmail(sc.next());
        System.out.print("Password: ");
        u.setPassword(sc.next());
        userDAO.register(u);
    }

    public void userLogin() {
        System.out.print("Email: ");
        email = sc.next();
        System.out.print("Password: ");
        String p = sc.next();

        if (userDAO.login(email, p)) {
            userMenu();
        } else System.out.println("Invalid Login");
    }

    public void userMenu() {
        while (true) {
            System.out.println("1 View 2 AddCart 3 Cart 4 Order 5 Logout");
            int c = sc.nextInt();
            if (c == 1) productDAO.viewProducts();
            if (c == 2) {
                System.out.print("PID Qty: ");
                cartDAO.addToCart(email, sc.nextInt(), sc.nextInt());
            }
            if (c == 3) cartDAO.viewCart(email);
            if (c == 4) orderDAO.placeOrder(email);
            if (c == 5) return;
        }
    }

    public void adminLogin() {
        System.out.print("Admin User: ");
        String u = sc.next();
        System.out.print("Admin Pass: ");
        String p = sc.next();

        if (adminDAO.adminLogin(u, p)) {
            System.out.println("✅ Admin Login Successful");
            System.out.print("Product Name Price Stock: ");
            adminDAO.addProduct(sc.next(), sc.nextDouble(), sc.nextInt());
        } else {
            System.out.println("❌ Incorrect Admin Username or Password");
        }
    }
}
