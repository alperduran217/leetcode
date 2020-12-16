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
public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        if (Objects.isNull(root)) {
            return false;
        }

        int val = root.val;
        return recursive(root.left, val) && recursive(root.right, val);
    }

    public boolean recursive(TreeNode root, int val) {
        if (Objects.nonNull(root)) {
            return root.val == val && recursive(root.left, val) && recursive(root.right, val);
        }
        return true;
    }
}