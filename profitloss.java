package arrays;

public class profitloss {
    public static void main(String[] args) {

        int[] arr = {100,180,260,310,40,535,695};

        int profit = 0;
        int buy = arr[0];

        for ( int i = 1; i < arr.length; i++) {

            // If price drops, sell at previous price
            if (arr[i] < arr[i - 1]) {
                profit += arr[i - 1] - buy;
                buy = arr[i]; // new buy
            }
        }

        // Final sell

            profit += arr[arr.length - 1] - buy;

        // If no profit, print 0
        if (profit <= 0) {
            System.out.println(0);
        } else {
            System.out.println(profit);
        }
    }
}