package com.education.arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> integerSet = new HashSet<>();
        for (int k : arr) {
            if (k % 2 == 0 && k != 0) {
                integerSet.add(k / 2);
            }
            if (k == 0) {
                if (integerSet.remove(k)) {
                    return true;
                } else {
                    integerSet.add(k);
                }
            }
        }

        for (int j : arr) {
            if (integerSet.remove(j) && j != 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        boolean b5 = checkIfExist(new int[]{2, 3, 3, 0, 0});
        boolean b4 = checkIfExist(new int[]{0, 0});
        boolean b3 = checkIfExist(new int[]{4, -7, 11, 4, 18});
        boolean b2 = checkIfExist(new int[]{-2, 0, 10, -194, 6, -8});
        boolean b = checkIfExist(new int[]{7, 1, 14, 11});
    }
}
