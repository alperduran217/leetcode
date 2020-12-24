package com.education.hashTable;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(
                Comparator.comparingInt(map::get));

        for (int num : nums) {
            if (!queue.contains(num)) {
                queue.offer(num);
                if (queue.size() > k) {
                    queue.poll();
                }
            }
        }

        int[] result = new int[queue.size()];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = queue.poll();
        }

        return result;

    }
}