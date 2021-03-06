package com.education.arrays;

public class BestTimeToBuyAndSellStockII {

    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int test1 = maxProfit(new int[]{1, 2, 3, 4, 5});
        int test0 = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        int test2 = maxProfit(new int[]{7, 6, 4, 3, 1});
    }
}
