package com.education.recursive;

public class MinPathSum {
    public static void main(String[] args) {
        int test0 = minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}});
        int test1 = minPathSum(new int[][]{{1, 2}, {1, 1}});
    }

    public static int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                } else if (i == 0) {
                    dp[i][j] += grid[i][j] + dp[i][j - 1];
                } else if (j == 0) {
                    dp[i][j] += grid[i][j] + dp[i - 1][j];
                } else {
                    dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }


}