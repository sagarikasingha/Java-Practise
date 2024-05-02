/*
 Best Time to Buy and Sell Stock
You are given an array of prices where prices[i] is the price of a
given stock on an ith day.
You want to maximize your profit by choosing a single day to buy
one stock and choosing a different day in the future to sell that
stock.
Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6),
profit = 6-1 = 5.

*/

public class BuySellStock {
    int stockPrice[] = { 7, 2, 5, 3, 6, 4, 9, 1, 5, 8, 6, 9 };

    public static void main(String args[]) {
        BuySellStock bs = new BuySellStock();
        bs.maxProfit();
    }

    private void maxProfit() {
        int low = stockPrice[0], high = 0;
        int position_i = 0, position_j = 0;
        for (int i = 1; i < stockPrice.length; i++) {
            if (stockPrice[i] < low) {
                low = stockPrice[i];
                position_i = i;
                for (int j = i + 1; j < stockPrice.length; j++) {
                    if (stockPrice[j] > low) {
                        if (high < stockPrice[j]) {
                            high = stockPrice[j];
                            position_j = j;
                        }
                    }
                }
            }
        }
        System.out.println(
                "Maximum Profit : if Invest on Day-" + (position_i + 1) + " and selling on Day-" + (position_j + 1));
        System.out.println("Invest: " + low + ", Sale: " + high + " , Profit: " + (high - low));
    }

}
