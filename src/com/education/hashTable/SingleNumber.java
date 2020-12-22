package com.education.hashTable;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!hashSet.add(nums[i])){
                hashSet.remove(nums[i]);
            }
        }
        
        return  hashSet.stream().findFirst().orElse(0);
    }
}