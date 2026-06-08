package collections.arraylist.linkedhashset;
import java.util.*;
public class operations {
    public static void main(String args[]){
        LinkedHashSet<String> ls=new LinkedHashSet<>();
        HashSet<String>hs=new HashSet<>();
        hs.add("sree");
        hs.add("amul");
        hs.add("icecream");
        hs.add("sree");
        hs.add("vada");
        System.out.println(hs);
   //linked hashset adding of the elements
        ls.add("sree");
        ls.add("amul");
        ls.add("icecream");
        ls.add("sree");
        ls.add("vada");
        System.out.println(ls);
    }
}
