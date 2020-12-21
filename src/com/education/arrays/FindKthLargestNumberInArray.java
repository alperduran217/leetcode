package com.education.arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKthLargestNumberInArray {
    public static void main(String[] args) {
        int secondLargest = findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
    }

    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(Integer::intValue));
        for (int i = 0; i < n; i++) {
            if (queue.size() < k) {
                queue.add(nums[i]);
            } else {
                if (queue.peek() < nums[i]) {
                    queue.poll();
                    queue.add(nums[i]);
                }
            }
        }
        if (queue.isEmpty()) {
            return 0;
        }
        if (queue.size() < k) {
            return 0;
        }
        return queue.peek();
    }

}
