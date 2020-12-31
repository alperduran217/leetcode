package com.education.arrays;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int test0 = coinChange(new int[]{1, 2, 5}, 11);
        int test1 = coinChange(new int[]{2}, 3);
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    int index = i - coins[j];
                    dp[i] = Math.min(dp[index] + 1, dp[i]);
                }
            }
        }

        return dp[amount];
    }

}

