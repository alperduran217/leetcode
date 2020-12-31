package com.education.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumSquares {
    public static void main(String[] args) {
        int test1 = numSquares(1);
        int test0 = numSquares(12);
    }

    public static int numSquares(int n) {
        List<Integer> squareList = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (i * i <= n) {
                squareList.add(i * i);
            }
        }


        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < squareList.size(); j++) {
                if (i >= squareList.get(j)) {
                    int index = i - squareList.get(j);
                    dp[i] = Math.min(dp[index] + 1, dp[i]);
                }
            }
        }

        return dp[dp.length - 1];

    }


}