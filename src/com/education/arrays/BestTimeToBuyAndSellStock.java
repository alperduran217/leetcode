package com.education.arrays;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int result = 0;
        int profit = 0;
        int currentMin;
        int min = Integer.MAX_VALUE;
        int maxProfit;
        for (int i = 0; i < n - 1; i++) {
            profit = prices[i + 1] - prices[i];
            maxProfit = Math.max(profit, prices[i + 1] - min);
            currentMin = Math.min(prices[i + 1], prices[i]);
            if (currentMin < min) {
                min = currentMin;
            }
            if (maxProfit > result) {
                result = maxProfit;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int test1 = maxProfit(new int[]{1, 2, 3, 4, 5});
        int test0 = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        int test2 = maxProfit(new int[]{7, 6, 4, 3, 1});
    }
}
