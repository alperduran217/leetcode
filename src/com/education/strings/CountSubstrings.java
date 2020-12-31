package com.education.strings;

public class CountSubstrings {
    public static void main(String[] args) {
        int test0 = countSubstrings("aaa");
    }

    public static int countSubstrings(String s) {
        int[][] dp = new int[s.length()][s.length()];
        int sum = 0;
        int i = 0;
        int j = 0;
        while (i < dp.length && j < dp.length) {
            if (i == j) {
                dp[i][j] = 1;
                sum++;
                j++;
                i = 0;
            } else {
                int characterSize = j - i + 1;
                if (s.charAt(i) == s.charAt(j)) {
                    if (characterSize == 2) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (dp[i][j] == 1) {
                        sum++;
                    }
                } else {
                    dp[i][j] = 0;
                }
                i++;
            }
        }
        return sum;
    }

}


