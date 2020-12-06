package com.education.arrays;

public class SquaresOfASortedArray {

    public static int[] sortedSquares(int[] nums) {

        int p1 = 0;
        int p2 = nums.length - 1;
        int p3 = nums.length - 1;

        int[] newArray= new int[nums.length];

        while(p1 < nums.length && p3 >= 0 && p3 >= p1){
            if (Math.abs(nums[p1]) >= Math.abs(nums[p3])) {
                newArray[p2] = nums[p1] * nums[p1];
                p1++;
            } else {
                newArray[p2] = nums[p3] * nums[p3];
                p3--;
            }
            p2--;
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] maxConsecutiveOnes4 = sortedSquares(new int[]{-4,-1,0,3,10});
        int[] maxConsecutiveOnes8 = sortedSquares(new int[]{-3,0,1});
        int[] maxConsecutiveOnes7 = sortedSquares(new int[]{-3,-3,-2,1});
        int[] maxConsecutiveOnes6 = sortedSquares(new int[]{-2,0});
        int[] maxConsecutiveOnes5 = sortedSquares(new int[]{-4,-4,-3});
        int[] maxConsecutiveOnes3 = sortedSquares(new int[]{-10000,-9999,-7,-5,0,0,10000});
        int[] maxConsecutiveOnes = sortedSquares(new int[]{-5, -3, -2, -1});
        int[] maxConsecutiveOnes2 = sortedSquares(new int[]{-7, -3, 2, 3, 11});

    }
}
