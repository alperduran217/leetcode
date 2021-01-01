package com.education.binarySearch;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {
            return answer;
        }


        answer[0] = binarySearch(nums, target, SearchDirection.LEFT);
        answer[1] = binarySearch(nums, target, SearchDirection.RIGHT);

        return answer;

    }

    public int binarySearch(int[] nums, int target, SearchDirection direction) {
        int left = 0;
        int right = nums.length - 1;
        int answer = -1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (direction == SearchDirection.LEFT) {

                if (nums[mid] > target) {
                    right = mid;
                }

                if (nums[mid] < target) {
                    left = mid + 1;
                    if (nums[left] == target) {
                        answer = left;
                        break;
                    }
                }

                if (nums[mid] == target) {
                    right = mid;
                }


            } else {
                if (nums[mid] > target) {
                    right = mid;

                }

                if (nums[mid] < target) {
                    left = mid + 1;
                }

                if (nums[mid] == target) {
                    left = mid + 1;
                    if (nums[left] != target) {
                        answer = left - 1;
                        break;
                    }
                }

            }
        }

        if (left == right && answer == -1) {
            if (direction == SearchDirection.RIGHT && right == nums.length - 1) {
                return right;
            } else if (direction == SearchDirection.LEFT && left == 0) {
                return left;
            }
        }

        return answer;
    }

    enum SearchDirection {
        LEFT,
        RIGHT
    }
}