package com.education.arrays;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int max = 0;
        if (nums.length == 1) {
            if (nums[0] == 1) {
                return 1;
            }
            return 0;
        } else if (nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                result++;
            } else {
                result = 0;
            }

            if (result > max) {
                max = result;
            }
        }


        return max;
    }

    public static void main(String[] args) {
        int maxConsecutiveOnes = findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
        if(maxConsecutiveOnes == 3){
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST NOT PASSED");
        }
    }
}
