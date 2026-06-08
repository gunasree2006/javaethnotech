package arrays;
/*
3 rounds
1.1st round visit all houses
2. visit only odd indexes
3.visit only even indexes
 */
import java.util.ArrayList;
public class theif {
    void main(){
        int[] arr = {5,4,3,8,5,1,0,2,8};
        // ArrayList<Integer> arr1 = new ArrayList<>(arr);
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0){
                odd.add(arr[i]);
            }
            else{
                even.add(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        // all values
        for (int x : arr) {
            sb.append(x).append(",");
        }

        // odd index values
        for (int o : odd) {
            sb.append(o).append(",");
        }

        // even index values
        for (int e : even) {
            sb.append(e).append(",");
        }

        // remove last comma
        sb.deleteCharAt(sb.length() - 1);

        sb.append("]");

        System.out.println(sb.toString());
    }
}

