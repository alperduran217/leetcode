package com.education.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindKthPositive {
    public static void main(String[] args) {
        int test1 = findKthPositive(new int[]{1,13,18}, 17);
    }

    public static int findKthPositive(int[] arr, int k) {
        Set<Integer> hashSet = new HashSet<>();

        for (int num : arr) {
            hashSet.add(num);
        }

        int index = 0;
        int result = 0;
        for (int i = 1; i <= arr[arr.length - 1]; i++) {
            if (!hashSet.contains(i)) {
                index++;
                if (index == k) {
                    result = i;
                }
            }
        }

        if (result == 0) {
            return arr[arr.length - 1] + k;
        }

        return result;

    }
}