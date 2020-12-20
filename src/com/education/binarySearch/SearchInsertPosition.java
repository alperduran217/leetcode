package com.education.binarySearch;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                if (mid > 0) {
                    if (nums[mid] - 1 == target && nums[mid - 1] != target) {
                        return mid;
                    }
                }

                right = mid;
            } else if (nums[mid] < target) {
                if (nums[mid] + 1 >= target) {
                    return mid + 1;
                }
                left = mid + 1;
            }
        }
        if (nums[left] + 1 <= target && left == nums.length - 1) {
            return left + 1;
        } else if (nums[left] == target) {
            return left;
        }
        return 0;
    }
}