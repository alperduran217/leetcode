package com.education.recursive;

import java.util.HashMap;
import java.util.Map;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int test0 = minCostClimbingStairs(new int[]{1, 0, 0, 0});
    }

    public static int minCostClimbingStairs(int[] cost) {
        return recursive(cost, 0, 0);
    }

    static Map<Integer, Integer> map = new HashMap<>();

    public static int recursive(int[] cost, int i, int result) {
        if (i < cost.length - 1) {
            if (map.containsKey(i)) {
                return map.get(i);
            }
            result += Math.min(recursive(cost, i + 1, cost[i]), recursive(cost, i + 2, cost[i + 1]));
            map.put(i, result);
        }
        return result;
    }
}