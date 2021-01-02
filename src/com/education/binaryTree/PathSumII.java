package com.education.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class PathSumII {
    public static void main(String[] args) {
        List<List<Integer>> test1 = pathSum(new TreeNode(1, new TreeNode(2), null), 1);
        List<List<Integer>> test0 = pathSum(new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1)))), 22);
    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, sum, 0, new ArrayList<>(), result);
        return result;
    }

    public static void dfs(TreeNode root, int totalSum, int currentSum, List<Integer> integerList, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        currentSum += root.val;
        integerList.add(root.val);
        dfs(root.left, totalSum, currentSum, integerList, result);
        dfs(root.right, totalSum, currentSum, integerList, result);
        if (totalSum == currentSum && root.left == null && root.right == null) {
            result.add(new ArrayList<>(integerList));
        }
        if (integerList.size() > 1) {
            integerList.remove(integerList.size() - 1);
        }
    }
}