package com.education.hashTable;

import java.util.LinkedList;
import java.util.Queue;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        int test2 = lengthOfLongestSubstring("abcabcbb");
        int test1 = lengthOfLongestSubstring("au");
        int test0 = lengthOfLongestSubstring("pwwkew");
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        Queue<Character> queue = new LinkedList<>();

        int i = 0;
        queue.add(s.charAt(i));
        i++;
        int max = 0;

        while (!queue.isEmpty() && i < s.length()) {
            if (!queue.contains(s.charAt(i))) {
                queue.add(s.charAt(i));
                i++;
            } else {
                int size = queue.size();
                if (size > max) {
                    max = size;
                }
                if (queue.peek() == s.charAt(i)) {
                    queue.poll();
                    queue.add(s.charAt(i));
                    i++;
                } else {
                    queue.poll();
                }
            }
        }

        if (!queue.isEmpty() && queue.size() > max) {
            return queue.size();
        }
        return max;

    }
}