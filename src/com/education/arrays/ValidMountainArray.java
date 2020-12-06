package com.education.arrays;

public class ValidMountainArray {

    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return false;
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        boolean part1 = true;
        boolean part2 = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        if(maxIndex == n -1 || maxIndex == 0){
            return false;
        }

        for (int i = 0; i < maxIndex; i++) {
            if (arr[i] > arr[i + 1]) {
                part1 = false;
                break;
            }
        }

        for (int i = maxIndex; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                part2 = false;
                break;
            }
        }

        return part1 && part2;
    }

    public static void main(String[] args) {
        boolean b4 = validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9});
        boolean b3 = validMountainArray(new int[]{3, 5, 5});
        boolean b = validMountainArray(new int[]{2, 0, 2});
        boolean b2 = validMountainArray(new int[]{0, 3, 4, 2, 1});
    }
}
