package com.education.arrays;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int p1 = 0;
        int sum = 0;

        while(p1 < nums.length - 1){
            sum = nums[p1] + nums[p1 + 1];
            nums[p1 + 1] = sum;
            p1++;
        }

        return nums;
    }
}
