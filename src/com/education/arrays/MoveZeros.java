package com.education.arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int p1 = 0;
        int p2 = 1;
        int n = nums.length;

        while (p1 < n && p2 < n) {
            if (nums[p1] == 0) {
                if (nums[p2] != 0) {
                    int temp = nums[p1];
                    nums[p1] = nums[p2];
                    nums[p2] = temp;
                    p1++;
                }
            } else {
                p1++;
            }
            p2++;
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{4, 2, 4, 0, 0, 3, 0, 5, 1, 0});
        moveZeroes(new int[]{0, 1, 0, 3, 12});
        moveZeroes(new int[]{1, 0});
    }
}
