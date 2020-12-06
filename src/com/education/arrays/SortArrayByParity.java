package com.education.arrays;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] A) {
        int p1 = 0;
        int p2 = 1;
        int n = A.length;

        while(p1 < n && p2 < n ){
            if(A[p2] % 2 == 0 && A[p1] %2 != 0){
                int temp = A[p2];
                A[p2] = A[p1];
                A[p1] = temp;
                p1++;
            } else if(A[p2] % 2 != 0 && A[p1] %2 != 0){
                p2++;
            } else{
                p1++;
                p2++;
            }
        }
        return A;
    }

    public static void main(String[] args) {
       sortArrayByParity(new int[]{3,1,2,4});
    }
}
