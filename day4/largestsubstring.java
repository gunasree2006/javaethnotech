package strings;

public class largestsubstring {
    public static void main(String args[]){
    String str[]=new String("i love to code java programming").split(" ");
    String max=" ";
    for(String word: str) {
        if (word.length()>max.length()) {
            max = word;
        }
    }
        System.out.print(max);
    }
}
