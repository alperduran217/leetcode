package com.education.arrays;

public class MaxSumSubArrayOfSizeK {
    public static void main(String[] args) {
        int test0 = findMaxSumSubArray(3, new int[]{2, 1, 5, 1, 3, 2});
    }

    public static int findMaxSumSubArray(int k, int[] arr) {
        int i = 0;
        int max = 0;
        int size = 1;
        int sum = 0;
        while (i < arr.length) {
            if (size > k) {
                sum -= arr[i - k];
            }
            sum += arr[i];
            max = Math.max(sum, max);
            size++;
            i++;
        }
        return max;
    }
}