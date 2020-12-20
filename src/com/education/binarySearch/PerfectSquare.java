package com.education.binarySearch;

public class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        long left = 2;
        long right = num / 2;

        if (num < 2) {
            return true;
        }

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == num) {
                return true;
            }

            if (mid * mid > num) {
                right = mid - 1;
            }

            if (mid * mid < num) {
                left = mid + 1;
            }

        }
        return false;
    }
}