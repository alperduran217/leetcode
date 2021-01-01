package com.education.arrays;

public class MaxAreaOfIsland {
    public static void main(String[] args) {
        int test1 = maxAreaOfIsland(new int[][]{{0, 1}});
        int test0 = maxAreaOfIsland(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}});
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int sum = 0;
        if (grid.length == 0) {
            return sum;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    sum = Math.max(dfs(grid, i, j), sum);
                }
            }
        }
        return sum;
    }


    public static int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = 2;
        return (1 + dfs(grid, i + 1, j) + dfs(grid, i - 1, j) + dfs(grid, i, j + 1) + dfs(grid, i, j - 1));
    }
}