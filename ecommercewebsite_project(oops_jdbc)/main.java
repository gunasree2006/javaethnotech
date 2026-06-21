package Ecommerce_project;

import Ecommerce_project.service.EcommerceService;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        EcommerceService s = new EcommerceService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1 Register 2 Login 3 Admin 4 Exit");
            int c = sc.nextInt();
            if (c == 1) s.registerUser();
            if (c == 2) s.userLogin();
            if (c == 3) s.adminLogin();
            if (c == 4) System.exit(0);
        }
    }
}