package com.education.binaryTree;

import java.util.Objects;

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
public class RangeSumofBST {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (Objects.isNull(root)) {
            return 0;
        }
        recursive(root, low, high);
        return sum;
    }

    public void recursive(TreeNode root, int low, int high) {
        if (Objects.nonNull(root)) {
            if (root.val >= low && root.val <= high) {
                sum += root.val;
            }
            recursive(root.left, low, high);
            recursive(root.right, low, high);
        }
    }
}