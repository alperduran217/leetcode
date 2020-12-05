package com.education.arrays;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                int temp = arr[i + 1];
                shift(arr, i + 1, temp);
                arr[i + 1] = 0;
                i++;
            }
        }
    }

    public static void shift(int[] arr, int index, int oldVal) {
        if (index < arr.length - 1) {
            int temp = arr[index + 1];
            arr[index + 1] = oldVal;
            index++;
            shift(arr, index, temp);
        }
    }

    public static void main(String[] args) {
        duplicateZeros(new int[]{0, 0, 0, 0, 0, 0, 0});
        duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
    }
}
