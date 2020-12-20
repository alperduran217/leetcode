package com.education.binarySearch;

import java.util.HashMap;

/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 * public int get(int index) {}
 * }
 */

class ArrayReader {
    int get(int index) {
        return this.map.get(index);
    }

    HashMap<Integer, Integer> map = new HashMap<>();
}


public class SearchInASortedArrayOfUnknownSize {
    public int search(ArrayReader reader, int target) {
        int left = 0;
        int right = 10000;
        while (reader.get(right) == 2147483647) {
            right--;
        }

        int result = -1;

        if (right == 0) {
            if (reader.get(right) == target) {
                return right;
            }
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (reader.get(mid) > target) {
                right = mid;
            } else if (reader.get(mid) == target) {
                result = mid;
                break;
            } else {
                left = mid + 1;
            }
        }

        if (reader.get(left) == target) {
            return left;
        }

        return result;
    }
}