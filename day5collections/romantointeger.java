package collections.arraylist.hashmap;
import java.util.*;

public class romantointeger {
    public static void main(String[] args) {
        String s = "MCMIV"; // Example

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int curr = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            if (curr < next)
                result -= curr;
            else
                result += curr;
        }

        // Add last character
        result += map.get(s.charAt(s.length() - 1));

        System.out.println(result);
    }
}
