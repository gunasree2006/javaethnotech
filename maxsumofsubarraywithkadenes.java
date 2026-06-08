package arrays;
import java.util.*;
public class maxsumofsubarraywithkadenes {
    public static void main(String args[]){
        int arr[]={2,-5,1,7,-3,4,-6};
        int sum=0;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            sum+=arr[i];
            max1=Math.max(max1,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max1);
    }
}
