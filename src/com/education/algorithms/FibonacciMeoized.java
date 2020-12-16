package com.education.algorithms;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Stack;

public class FibonacciMeoized {

    public static void main(String[] args) {

        int test0 = findNthFibonacci(5);
    }

    public static int findNthFibonacci(int n) {
        int[] memo = new int[n + 1];
        return memoized(n, memo);
    }

    static int result = 0;

    public static int memoized(int n, int[] memo) {
        if (memo[n] != 0) {
            return memo[n];
        }
        if (n == 1 || n == 2) {
            result = 1;
        } else {
            result = memoized(n - 1, memo) + memoized(n - 2, memo);
        }


        memo[n] = result;
        return result;
    }

    public static int bottomUp(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int[] bottomUp = new int[n + 1];
        bottomUp[1] = 1;
        bottomUp[2] = 1;
        for (int i = 0; i < 3; i++) {
            bottomUp[i] = bottomUp[i - 1] + bottomUp[i - 2];
        }
        return bottomUp[n];
    }

}
