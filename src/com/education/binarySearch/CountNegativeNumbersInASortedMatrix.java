package com.education.binarySearch;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int test4 = countNegatives(new int[][]{{8, -2, -2, -2, -4, -5, -5}, {-2, -3, -3, -4, -4, -5, -5}, {-2, -5, -5, -5, -5, -5, -5}, {-3, -5, -5, -5, -5, -5, -5}, {-5, -5, -5, -5, -5, -5, -5}, {-5, -5, -5, -5, -5, -5, -5}, {-5, -5, -5, -5, -5, -5, -5}, {-5, -5, -5, -5, -5, -5, -5}, {-5, -5, -5, -5, -5, -5, -5}});
        int test3 = countNegatives(new int[][]{{3, -1, -3, -3, -3}, {2, -2, -3, -3, -3}, {1, -2, -3, -3, -3}, {0, -3, -3, -3, -3}});
        int test1 = countNegatives(new int[][]{{3, 2}, {1, 0}});
        int test0 = countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}});
    }

    public static int countNegatives(int[][] grid) {
        int result = 0;
        for (int[] singleGrid : grid) {
            result += count(singleGrid);
        }
        return result;
    }

    public static int count(int[] singleGrid) {
        int left = 0;
        int right = singleGrid.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > 0) {
                if (singleGrid[mid - 1] >= 0 && singleGrid[mid] < 0) {
                    left = mid;
                }
            }
            if (singleGrid[mid] < 0) {
                right = mid - 1;
            }


            if (singleGrid[mid] >= 0 && singleGrid[mid + 1] < 0) {
                left = mid + 1;
            }

            if (singleGrid[mid] >= 0) {
                left = mid + 1;
            }
        }

        if (right == singleGrid.length - 1 && left == singleGrid.length - 1 && singleGrid[left] >= 0) {
            return 0;
        }

        return singleGrid.length - left;
    }
}