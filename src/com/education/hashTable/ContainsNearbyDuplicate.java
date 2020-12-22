package com.education.hashTable;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        boolean test0 = containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1);
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            } else{
                int index = map.get(nums[i]);
                if(i - index <=k){
                    return true;
                } else{
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}