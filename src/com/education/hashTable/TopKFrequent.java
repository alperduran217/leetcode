package com.education.hashTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    public static void main(String[] args) {
        List<String> test1 = topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4);
        List<String> test0 = topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2);
    }

    public static List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<String> queue = new PriorityQueue<>(
                (w1, w2) -> map.get(w1).equals(map.get(w2)) ?
                        w2.compareTo(w1) : map.get(w1) - map.get(w2));
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], map.get(words[i]) + 1);
            }
        }


        for (int i = 0; i < words.length; i++) {
            if (!queue.contains(words[i])) {

                queue.offer(words[i]);
                if (queue.size() > k) {
                    queue.poll();
                }
            }


        }

        while (!queue.isEmpty()) {
            String val = queue.poll();
            result.add(val);
        }
        Collections.reverse(result);
        return result;
    }
}