package com.education.stack;

import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] test1 = dailyTemperatures(new int[]{89, 62, 70, 58, 47, 47, 46, 76, 100, 70});
        int[] test0 = dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
    }

    public static int[] dailyTemperatures(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{arr.length - 1, arr[arr.length - 1]});
        arr[arr.length - 1] = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek()[1] < arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                stack.push(new int[]{i, arr[i]});
                arr[i] = 0;
            } else if (stack.peek()[1] < arr[i]) {
                arr[i] = stack.peek()[0] - 1;
                stack.push(new int[]{i, arr[i]});
            } else if (stack.peek()[1] > arr[i]) {
                int i1 = stack.peek()[0];
                stack.push(new int[]{i, arr[i]});
                arr[i] = i1 - i;
            } else if (stack.peek()[1] == arr[i]) {
                arr[i] = arr[i + 1] + 1;
            }
        }

        return arr;
    }
}