package com.education.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public static void main(String[] args) {
        subarraySum(new int[]{0,0,0,0,0,0,0,0,0,0}, 0);
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i != 0) {
                int val = sum - k;
                if (map.containsKey(val)) {
                    result += map.get(val);
                }
            }
            if (!map.containsKey(sum)) {
                map.put(sum, 1);
            } else {
                map.put(sum, map.get(sum) + 1);
            }
            if (sum == k) {
                result++;
            }
        }
        return result;
    }

}


