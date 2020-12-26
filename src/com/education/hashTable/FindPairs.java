package com.education.hashTable;

import java.util.HashMap;
import java.util.Map;

public class FindPairs {

    public static void main(String[] args) {
        int test0 = findPairs(new int[]{1, 3, 1, 5, 4}, 0);
        int test2 = findPairs(new int[]{3, 1, 4, 1, 5}, 2);
        int test1 = findPairs(new int[]{1, 1, 1, 1, 1}, 0);
    }

    public static int findPairs(int[] nums, int k) {
        int result = 0;
        if (nums == null || nums.length == 0) {
            return result;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num - k)) {
                map.put(num - k, k == 0 ? 0 : 1);
            } else {
                map.put(num - k, map.get(num - k) + 1);
            }
        }


        for (int num : nums) {
            if (map.containsKey(num)) {
                Integer val = map.get(num);
                if (val > 0) {
                    result++;
                    map.put(num, -1);
                }
            }
        }

        return result;
    }
}