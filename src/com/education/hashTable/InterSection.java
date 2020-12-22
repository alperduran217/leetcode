package com.education.hashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterSection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int j : nums1) {
            hashSet1.add(j);
        }

        if(hashSet1.isEmpty()){
            return nums1;
        }

        for (int j : nums2) {
            if (hashSet1.contains(j)) {
                result.add(j);
            }
        }
        return result.stream().mapToInt(Number::intValue).toArray();
    }
}