package strings;

public class count_eachcharandprinteachcharcount {
    public static void main(String args[]) {
        int count = 1;
        String str = "aabbbbeeeeffggg";

        // str = str + " " ;    --- no need to have extra print stmt for printing last char count

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                System.out.print(str.charAt(i - 1) + "" + count);
                count = 1;
            }

        }
        System.out.print(str.charAt(str.length() - 1) + "" + count);
    }
}