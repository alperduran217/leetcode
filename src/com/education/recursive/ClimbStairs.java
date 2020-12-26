package com.education.recursive;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {

    public static void main(String[] args) {
        int test1 = climbStairs(3);
        int test0 = climbStairs(2);
    }

    static Map<Integer, Integer> map = new HashMap<>();

    public static int climbStairs(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        int left = climbStairs(n - 1);
        int right = climbStairs(n - 2);
        map.put(n, left + right);

        return left + right;

    }
}