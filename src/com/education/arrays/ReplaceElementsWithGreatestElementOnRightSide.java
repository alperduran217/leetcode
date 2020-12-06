package com.education.arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            if (max > arr[i - 1]) {
                arr[i - 1] = max;
            } else {
                int temp = arr[i - 1];
                arr[i - 1] = max;
                max = temp;
            }
        }

        arr[arr.length - 1] = -1;

        return arr;
    }

    public static void main(String[] args) {
        int[] ints = replaceElements(new int[]{17, 18, 5, 4, 6, 1});
    }
}
