package com.education.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int sum;

        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                sum = i + map.get(list2[i]);
                if (sum < min) {
                    result.clear();
                    result.add(list2[i]);
                    min = sum;
                } else if (sum == min)
                    result.add(list2[i]);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}

