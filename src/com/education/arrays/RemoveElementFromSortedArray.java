package com.education.arrays;

public class RemoveElementFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int p1 = 0;
        int p2 = 1;
        int n = nums.length;
        int result = 0;

        while (p1 < n && p2 < n) {
            if (nums[p1] == nums[p2]) {
                p2++;
            } else {
                p1++;
                nums[p1] = nums[p2];
                result++;

            }
        }
        return result +1 ;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 1, 2});
    }

}
