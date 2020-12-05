package com.education.arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < nums2.length; i++) {
            nums1[m] = nums2[i];
            m++;
        }

        int length = nums1.length;

        for (int i = 0; i < length - 1; i++) {
            int minimumIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (nums1[j] < nums1[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            int temp = nums1[minimumIndex];
            nums1[minimumIndex] = nums1[i];
            nums1[i] = temp;
        }

    }

    public static void main(String[] args) {
        merge(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3);
    }
}
