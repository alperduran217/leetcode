package com.education.binarySearch;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int firstValue = nums[0];
            int mid = left + (right - left) / 2;
            int currentValue = nums[mid];
            if (firstValue > currentValue) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return Math.min(nums[left], nums[0]);
    }
}