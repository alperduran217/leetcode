package com.education.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {
        int[] test0 = smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
        int[] ints = smallerNumbersThanCurrent(new int[]{6, 5, 4, 8});
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(sortedNums[i]))
                map.put(sortedNums[i], i);
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }
}