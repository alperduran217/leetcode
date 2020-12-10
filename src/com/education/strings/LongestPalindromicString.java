package com.education.strings;

public class LongestPalindromicString {
    public static String longestPalindrome(String s) {
        if (s.length() < 2) {
            return String.valueOf(s.charAt(0));
        }

        int p1 = 0;
        int p2 = s.length();
        String result = "";
        int max = -1;

        while (p1 < s.length() && p2 >= 0) {
            String subS = s.substring(p1, p2);
            if (isPalindromic(subS)) {
                if (subS.length() > max) {
                    max = subS.length();
                    result = subS;
                }
                p1++;
                p2 = s.length();
            } else {
                if (p2 != 0) {
                    p2--;
                } else {
                    p1++;
                }
            }
        }
        return result;
    }

    private static boolean isPalindromic(String s) {
        int first;
        int second;
        if (s.length() % 2 == 0) {
            first = s.length() / 2;
            second = s.length() / 2;
        } else {
            first = s.length() / 2;
            second = s.length() / 2 + 1;
        }
        int p1 = 0;
        int p2 = s.length() - 1;
        int result = 0;
        while (p1 <= first && p2 >= second) {
            if(s.charAt(p1) != s.charAt(p2)){
                break;
            } else{
                result++;
            }
            p1++;
            p2--;
        }
        return result == s.length()/2;
    }

    public static void main(String[] args) {
        String s2 = longestPalindrome("cmmrracelnclsbtdmuxtfiyahrvxuwreyorosyqapfpnsntommsujibzwhgugwtvxsdsltiiyymiofbslwbwevmjrsbbssicnxptvwmsmiifypoujftxylpyvirfueagprfyyydxeiftathaygmolkcwoaavmdmjsuwoibtuqoewaexihispsshwnsurjopdwttlzyqdbkypvjsbuidsdnpgklhwfnqdvlffcysnxeywvwvblatmxbflnuykhfhjptenhcxqinomlwalvlezefqybpuepbnymzlruuirpiatqgjgcnfmrlzshauoxuoqopcikogfwpssjdeplytcapmujyvgtfmmolnuadpwblgmcaututcrwsqrlpaaqobjfnhudmsulztbdkxpfejavastxejtpbqfftdtcdhvtpbzfuqcwkxtldtjycreimiujtxudtmokcoebhodbkgkgxjzrgyuqhozqtidltodlkziyofdeszwiobkwesdijxbbagguxvofvtphqxgvidqfkljufgubjmjllxoanbizwtedykwmneaosopynzlzvrlqcmyaahdcagfatlhwtgqxsyxwjhexfiplwtrtydjzrsysrcwszlntwrpgfedhgjzhztffqnjotlfudvczwfkhuwmdzcqgrmfttwaxocohtuscdxwfvhcymjpkqexusdaccw");
        String s = longestPalindrome("babad");
        String s1 = longestPalindrome("cbbd");
    }
}
