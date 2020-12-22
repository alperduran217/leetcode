package com.education.hashTable;

import java.util.HashSet;
import java.util.Set;

class NumJewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> hashSet = new HashSet<>();

        for (int i = 0; i < jewels.length(); i++) {
            hashSet.add(jewels.charAt(i));
        }

        int result = 0;

        for (int i = 0; i < stones.length(); i++) {
            if (hashSet.contains(stones.charAt(i))) {
                result++;
            }
        }

        return result;

    }
}