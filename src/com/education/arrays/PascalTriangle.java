package com.education.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        List<List<Integer>> generate = generate(4);
    }

    public static List<List<Integer>> generate(int numRows) {
        recursive(0, numRows, Arrays.asList(1));
        return result;
    }

    static List<List<Integer>> result = new ArrayList<>();

    public static void recursive(int currentLevel, int numRows, List<Integer> prevList) {
        if (currentLevel != numRows) {
            List<Integer> currentList = new ArrayList<>();
            if (currentLevel != 0) {
                currentList.add(1);
            }

            int p1 = 0;
            int p2 = 1;

            while (p1 < prevList.size() && p2 < prevList.size()) {
                currentList.add(prevList.get(p1) + prevList.get(p2));
                p1++;
                p2++;
            }

            currentList.add(1);
            result.add(currentList);
            currentLevel++;
            recursive(currentLevel, numRows, currentList);
        }
    }
}