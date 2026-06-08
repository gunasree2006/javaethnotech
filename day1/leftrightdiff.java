package arrays;
import java.util.*;
public class leftrightdiff {
    public static void main(String args[]){
        int arr[]={10,4,8,3};
        int leftsum[]=new int[arr.length];
        int rightsum[]=new int[arr.length];
        leftsum[0]=0;
        for(int i=1;i<arr.length;i++){
            leftsum[i]=leftsum[i-1]+arr[i-1];

        }
        int n=arr.length;
        rightsum[n-1]=0;
        for(int i=n-2;i>=0;i--){
            rightsum[i]=rightsum[i+1]+arr[i+1];
        }
        System.out.println("leftsumarray: "+Arrays.toString(leftsum));
        System.out.println("rightsumarray: "+Arrays.toString(rightsum));
        for(int i=0;i<arr.length;i++){
            System.out.print(Math.abs(leftsum[i]-rightsum[i])+" ");
        }
    }
}
