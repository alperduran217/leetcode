package com.education.arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxFruitCountOf2Types {
    public static void main(String[] args) {
        int test1 = findLength(new char[]{'A', 'B', 'C', 'B', 'B', 'C'});
        int test0 = findLength(new char[]{'A', 'B', 'C', 'A', 'C'});
    }

    public static int findLength(char[] arr) {
        int result = 0;
        if (arr == null || arr.length == 0) {
            return result;
        }
        int max = 0;
        int beginIndex = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            while (map.size() > 2) {
                map.remove(arr[i - map.size()]);
                beginIndex = i - map.size();
            }
            if (map.containsKey(arr[i])) {
                result = i - beginIndex + 1;
                max = Math.max(result, max);
            } else {
                map.put(arr[i], i);
            }
        }
        return max;
    }
}