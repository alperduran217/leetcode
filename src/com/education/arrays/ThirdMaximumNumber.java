package com.education.arrays;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        int n = nums.length;
        int p1 = 0;
        int p2 = 1;
        int maxCount = 0;
        int result = 0;
        int duplication = 0;

        if (n == 2) {
            if (nums[p1] > nums[p2]) {
                return nums[p1];
            } else {
                return nums[p2];
            }
        } else if (n == 1) {
            return nums[0];
        }

        while (p1 < n && p2 < n) {
            if (p1 != p2) {
                if (nums[p1] < nums[p2]) {
                    maxCount++;
                } else if (nums[p1] == nums[p2]) {
                    duplication++;
                }
            }
            if (p2 == n - 1) {
                if (maxCount - duplication / 2 == 2) {
                    result = nums[p1];
                    break;
                }
                p2 = 0;
                p1++;
                maxCount = 0;
            } else {
                p2++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int test0 = thirdMax(new int[]{2, 2, 3, 1});
    }
}
