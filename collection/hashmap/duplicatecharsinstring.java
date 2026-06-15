package collections.arraylist.hashmap;


import java.util.*;

public class duplicatecharsinstring{
    public static void main(String[] args) {
        String s = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() > 1)
                System.out.print(e.getKey() + " ");
        }
    }
}