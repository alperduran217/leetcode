package com.education.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < n; i++) {
            int val = target - nums[i];
            if (map.containsKey(val) && i != map.get(val)) {
                result[0] = i;
                result[1] = map.get(val);
            }
        }

        return result;
    }
}