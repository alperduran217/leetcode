package com.education.arrays;

public class SquaresOfASortedArray {

    public static int[] sortedSquares(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = Math.multiplyExact(nums[i], nums[i]);
        }

        //selection sort
        for (int i = 0; i < n - 1; i++) {
            int minimumIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            int temp = nums[minimumIndex];
            nums[minimumIndex] = nums[i];
            nums[i] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] maxConsecutiveOnes = sortedSquares(new int[]{-7,-3,2,3,11});

    }
}
