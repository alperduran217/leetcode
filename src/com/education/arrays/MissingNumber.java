package com.education.arrays;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }


        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.contains(i)) {
                return i;
            }
        }
        return nums.length;
    }
}