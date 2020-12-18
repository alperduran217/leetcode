package com.education.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        Map<Integer, Integer> table = new HashMap();
        int rightSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            rightSum += nums[i];
            table.put(i, rightSum);
        }
        int leftSum = 0;
        int result = -1;

        for (int i = 0; i < n; i++) {
            leftSum += nums[i];
            if (table.get(i) == leftSum) {
                result = i;
                break;
            }
        }
        return result;
    }
}