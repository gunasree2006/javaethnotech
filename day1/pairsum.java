package arrays;

public class pairsum {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=10;
        int left=arr[0];
        int right=arr.length-1;
        while(left<right){
            if(left+right==target) {
                System.out.print("["+left + "," + right+"]"+ " ");
                left++;
                right--;
            }
            else if(left+right<target){
                left++;
            }
            else{
                right--;
            }
        }
    }
}
