package com.education.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {
    public static void main(String[] args) {
        List<Integer> test2 = partitionLabels("aebbedaddc");
        List<Integer> test1 = partitionLabels("eaaaabaaec");
        List<Integer> test0 = partitionLabels("ababcbacadefegdehijhklij");
    }

    public static List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();

        if (S.length() == 0) {
            return result;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), i);
        }

        int p1 = 0;
        int p2 = 1;

        int max = 0;
        int oldMax = 0;

        while (p1 < S.length() && p2 < S.length()) {
            int current = map.get(S.charAt(p1));
            int next = map.get(S.charAt(p2));

            if (current > max) {
                max = current;
            }

            if (next > current && max < next && p1 == current && p2 >= max) {
                result.add(max + 1 - oldMax);
                oldMax = max + 1;
            }

            if (p2 == S.length() - 1) {
                result.add(S.length() - oldMax);
            }

            p1++;
            p2++;
        }

        return result;
    }
}