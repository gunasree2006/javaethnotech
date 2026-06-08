package strings;
import java.util.Scanner;

public class binaryoper {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="1C0C1C1A0B1";
        int res=str.charAt(0)-'0';
        for(int i=1;i<str.length();i+=2){
            int val=str.charAt(i+1)-'0';
            char ch=str.charAt(i);
            if(ch=='C')
                res=res^val;

            else if(ch=='A')
                res=res&val;
            else if(ch=='B')
                res=res | val;
        }
        System.out.print(res);
    }
}
