package com.education.binarySearch;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char test1 = nextGreatestLetter(new char[]{'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'}, 'e');
        char test0 = nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'g');
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                right = mid;
            }

            if (letters[mid] < target) {
                left = mid + 1;
            }

            if (letters[mid] == target) {
                if (letters[mid + 1] == target) {
                    left++;
                } else {
                    return letters[mid + 1];
                }
            }

        }
        if (target >= letters[left] && left == letters.length - 1) {
            return letters[0];
        }
        return letters[left];
    }
}