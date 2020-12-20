package com.education.binarySearch;

class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid - 1]) {
                if (arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                left = mid + 1;
            }
            if (arr[mid] < arr[mid - 1]) {
                if (arr[mid] < arr[mid + 1]) {
                    return mid;
                }
                right = mid;
            }

        }
        return -1;
    }
}