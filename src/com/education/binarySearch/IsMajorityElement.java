package com.education.binarySearch;

public class IsMajorityElement {
    public static void main(String[] args) {
        isMajorityElement(new int[]{10, 100, 101, 101}, 101);
        isMajorityElement(new int[]{2, 4, 5, 5, 5, 5, 5, 6, 6}, 5);
    }

    public static boolean isMajorityElement(int[] nums, int target) {
        if(nums.length == 1){
            return nums[0] == target;
        }
        int first = binarySearch(nums, SearchType.FIRST, target);
        int second = binarySearch(nums, SearchType.LAST, target);
        int result = second - first + 1;

        return result > nums.length / 2;

    }

    public static int binarySearch(int[] nums, SearchType type, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            }

            if (nums[mid] == target && type == SearchType.FIRST) {
                right = mid;
            }

            if (nums[mid] == target && type == SearchType.LAST) {
                left = mid + 1;
            }

        }
        return left;
    }

    enum SearchType {
        FIRST,
        LAST
    }
}