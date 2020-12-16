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
public class SearchinABinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(18, new TreeNode(2, null, null), new TreeNode(22, null, new TreeNode(63, null, new TreeNode(84, null, null))));
        searchBST(root, 63);

    }

    public static TreeNode result;

    public static TreeNode searchBST(TreeNode root, int val) {
        if (Objects.isNull(root)) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        search(root, val);
        return result;
    }

    public static void search(TreeNode root, int val) {
        if (Objects.nonNull(root)) {


            if (Objects.nonNull(root.left)) {
                if (root.left.val == val) {
                    result = root.left;
                }
                searchBST(root.left, val);
            }

            if (Objects.nonNull(root.right)) {
                if (root.right.val == val) {
                    result = root.right;
                }
                searchBST(root.right, val);
            }
        }
    }
}