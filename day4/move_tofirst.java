package strings;

public class move_tofirst {
    public static void main(String args[]){
        String str="abc_de_gh";
        StringBuilder sb=new StringBuilder(str);
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch=='_')
                sb1.append(ch);

            else
                sb2.append(ch);

        }
        System.out.println(sb1+""+sb2);
    }
}
