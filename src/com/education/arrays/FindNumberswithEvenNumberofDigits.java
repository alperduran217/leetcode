package com.education.arrays;

public class FindNumberswithEvenNumberofDigits {

    public static int findNumbers(int[] nums) {
        int result = 0;

        for(int i =0 ; i < nums.length ; i++){
            StringBuilder sb = new StringBuilder(String.valueOf(nums[i]));
            if(sb.length() % 2 == 0){
                result ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int maxConsecutiveOnes = findNumbers(new int[]{12,345,2,6,7896});
        if(maxConsecutiveOnes == 2){
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST NOT PASSED");
        }
    }
}
