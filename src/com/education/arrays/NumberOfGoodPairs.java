package com.education.arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
        numIdenticalPairs(new int[]{1,2,3,1,1,3});
    }

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            } else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        
        return map.values().stream().mapToInt(val -> ((val * (val - 1)) / 2)).sum();

    }
    
 
}