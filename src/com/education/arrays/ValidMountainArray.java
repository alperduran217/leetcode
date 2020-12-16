package com.education.arrays;

public class ValidMountainArray {

    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int p1 = 0;
        while(p1 < arr.length && p1 + 1 < arr.length && arr[p1] < arr[p1 + 1]){
            p1++;
        }

        if(p1 == 0 || p1 + 1 >= arr.length) {
            return false;
        }

        while(p1 < arr.length && p1 + 1 < arr.length ){
            if(arr[p1] <= arr[p1++ + 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean b4 = validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9});
        boolean b3 = validMountainArray(new int[]{3, 5, 5});
        boolean b = validMountainArray(new int[]{2, 0, 2});
        boolean b2 = validMountainArray(new int[]{0, 3, 4, 2, 1});
    }
}
