package com.education.binaryTree;

import java.util.Objects;

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                3,
                new TreeNode(9, null, null), new TreeNode(20,
                new TreeNode(15, null, null), new TreeNode(7, null, null)));

        int test0 = maxDepth(root);

    }

    public static int maxDepth(TreeNode root) {
        return recursive(0, root);
    }

    public static int recursive(int i, TreeNode root) {
        if (Objects.isNull(root)) {
            return i;
        }
        return Math.max(recursive(i, root.left), recursive(i, root.right)) + 1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
