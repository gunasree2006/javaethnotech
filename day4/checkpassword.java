package strings;
import java.util.*;

public class checkpassword {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();

        // Length check
        if (str1.length() < 4) {
            System.out.print("0");
            return;
        }

        // Should not start with a digit
        if (str1.charAt(0) >= '0' && str1.charAt(0) <= '9') {
            System.out.print("0");
            return;
        }

        int digitcount = 0;
        int upcount = 0;
        int locount = 0;
        int sp = 0;

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if (ch >= '0' && ch <= '9')
                digitcount++;
            else if (ch >= 'A' && ch <= 'Z')
                upcount++;
            else if (ch >= 'a' && ch <= 'z')
                locount++;
            else if (ch == '/' || ch == ' ')
                sp++;
        }

        if (digitcount > 0 && upcount > 0 && locount > 0 && sp == 0) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}