package com.education.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        if (s.length() == 0) {
            return -1;
        }
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), true);
            } else {
                map.put(s.charAt(i), false);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}