package collections.arraylist;
import java.util.*;
public class arraylistoperation {
    public static void main(String args[]){
        ArrayList<String>list =new ArrayList<>(10);
        // adding the elements
        list.add("andhala nadive");
        list.add("ee rathale");
        list.add("nagumomu tharale");
        list.add("vintunava");
        list.add("nuvvunte chaley");
        // accessing the elements with for loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        // accssing elements with foreach
        for(String s:list){
            System.out.println(s);
        }
        //deleting element
        System.out.println("deleting element:...");
        System.out.println(list.remove(3));
         // updating element
        System.out.println("updating element:....");
        System.out.println(list.set(1,"thasadiyaa"));
        //checking that element exist or not
        System.out.println( list.contains("thasadiyaa"));
    }
}
