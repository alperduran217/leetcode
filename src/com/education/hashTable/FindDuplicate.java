package com.education.hashTable;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            if (!hashSet.contains(num)) {
                hashSet.add(num);
            } else {
                return num;
            }
        }
        return -1;

    }
}