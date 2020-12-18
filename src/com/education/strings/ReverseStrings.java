package com.education.strings;

public class ReverseStrings {
    public void reverseString(char[] s) {
        int n = s.length;
        int p1 = 0;
        int p2 = n - 1;

        char temp;

        while (p1 < n && p2 >= 0 && p2 > p1) {
            temp = s[p1];
            s[p1] = s[p2];
            s[p2] = temp;
            p1++;
            p2--;
        }

    }
}