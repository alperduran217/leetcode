package com.education.strings;

import java.util.LinkedList;
import java.util.Queue;

class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        int p1 = 0;
        int p2 = 0;

        while(p1 < s.length() && p2 < t.length()){
            if(s.charAt(p1) == t.charAt(p2)){
                if(p1 == s.length() -1){
                    return true;
                }
                p1++;
            }
            p2++;
        }
        return false;
    }
}