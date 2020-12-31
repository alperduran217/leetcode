package com.education.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenerateMatrix {
    public static void main(String[] args) {
        int[][] test0 = generateMatrix(3);
    }

    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        recursive(result, 0, 0, 1, n);
        return result;
    }

    static Map<List<Integer>, Boolean> boundaryMap = new HashMap<>();

    public static void recursive(int[][] result, int i, int j, int num, int n) {
        if (i < n - 1) {
            if (j < n) {
                result[i][j] = num;
                boundaryMap.put(Arrays.asList(i, j), true);
                recursive(result, i, j + 1, num + 1, n);
            } else {
                result[i + 1][j - 1] = num;
                boundaryMap.put(Arrays.asList(i + 1, j - 1), true);
                recursive(result, i + 1, j, num + 1, n);
            }
        } else {
            if (j > 1) {
                result[i][j - 2] = num;
                boundaryMap.put(Arrays.asList(i, j - 2), true);
                recursive(result, i, j - 1, num + 1, n);
            } else {
                result[i - 1][j] = num;
                boundaryMap.put(Arrays.asList(i - 1, j), true);
                recursive(result, i - 1, j, num + 1, n);
            }
        }
    }
}