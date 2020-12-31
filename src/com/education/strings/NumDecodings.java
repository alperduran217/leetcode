package com.education.strings;

public class NumDecodings {

    public static void main(String[] args) {
        numDecodings("226");
    }

    public static int numDecodings(String s) {
        int result = 0;
        int p1 = 0;
        int p2 = 1;
        int p3 = 2;
        if(s.length() < 3){
            p3 = -1;
        }
        while (p1 < s.length() && p2 < s.length() && p3 < s.length()) {
            int val1 = Character.getNumericValue(s.charAt(p1));
            int val2 = Character.getNumericValue(s.charAt(p2));
            int val3 = Character.getNumericValue(s.charAt(p3));

            if (isValid(val1, val2, val3)) {
                result++;
            }


            if (isValid((val1 * 10) + val2, val3, 0)) {
                result++;
            }

            if (isValid(val1, (val2 * 10) + val3, 0)) {
                result++;
            }


            p1++;
            p2++;
            p3++;
        }
        return result;
    }

    public static boolean isValid(int val1, int val2, int val3) {
        if (val3 != 0) {
            return val1 <= 26 && val2 <= 26 && val3 <= 26;
        } else {
            return val1 <= 26 && val2 <= 26;
        }
    }
}