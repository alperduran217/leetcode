package com.education.arrays;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int[]ar=heights.clone();
        Arrays.sort(heights);
        int ans=0;
        for(int i=0;i<ar.length;i++)
            if(heights[i]!=ar[i])
                ans++;
        return ans;
    }

    public static void main(String[] args) {
        int i = heightChecker(new int[]{1, 1, 4, 2, 1, 3});

    }
}
