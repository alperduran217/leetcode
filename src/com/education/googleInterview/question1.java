package com.education.googleInterview;

import java.util.HashSet;
import java.util.Set;

public class question1 {

    public static void main(String[] args) {

        int test1 = numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.email.leet+alex@code.com"});
        int test0 = numUniqueEmails(new String[]{"testemail@leetcode.com", "testemail1@leetcode.com", "testemail+david@lee.tcode.com"});
    }

    public static int numUniqueEmails(String[] emails) {
        int n = emails.length;
        Set<String> result = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] parts = emails[i].split("@");
            result.add(manipulateLocalName(parts[0]) + "@" + parts[1]);
        }

        return result.size();
    }

    static String manipulateLocalName(String s) {
        String dot = s.replaceAll("\\.", "");
        return dot.split("\\+")[0];
    }


}
