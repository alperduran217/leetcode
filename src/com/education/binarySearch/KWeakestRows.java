package com.education.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        int j = 0;
        Map<Integer, List<Integer>> strengths = new HashMap<>();

        for (int[] soldiers : mat) {
            int weakness = binarySearch(soldiers);
            if (!strengths.containsKey(weakness)) {
                strengths.put(weakness, new ArrayList<>());
            }
            strengths.get(weakness).add(j);
            j++;
        }

        List<Integer> sortedStrengths = new ArrayList<>(strengths.keySet());
        Collections.sort(sortedStrengths);

        int[] indexes = new int[k];
        int i = 0;
        for (int key : sortedStrengths) {
            for (int index : strengths.get(key)) {
                indexes[i] = index;
                i++;
                if (i == k) break;
            }
            if (i == k) break;
        }

        return indexes;
    }

    public int binarySearch(int[] soldiers) {
        int left = 0;
        int right = soldiers.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (soldiers[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        return left;
    }
}