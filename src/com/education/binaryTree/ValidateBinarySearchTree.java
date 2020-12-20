package com.education.binaryTree;

import java.util.HashMap;
import java.util.Map;
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
public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null));
        TreeNode root1 = new TreeNode(5, new TreeNode(4, null, null), new TreeNode(6, new TreeNode(3, null, null), new TreeNode(7, null, null)));
        TreeNode root2 = new TreeNode(0, new TreeNode(1, null, null), null);
        boolean test2 = isValidBST(root2);
        boolean test1 = isValidBST(root1);
        boolean test0 = isValidBST(root);
        Map<String, String> map = new HashMap<>();
    }

    public static boolean isValidBST(TreeNode root) {
        if (Objects.isNull(root)) {
            return false;
        }
        isValid(root, null, null);
        return result;

    }

    static boolean result = false;


    public static void isValid(TreeNode root, Integer max, Integer min) {
        if (max != null && root.val >= max || min != null && min <= root.val) {
            result = false;
        } else if (Objects.nonNull(root)) {
            if (Objects.nonNull(root.left)) {
                result = root.val > root.left.val;
                if (result) {
                    isValid(root.left, root.val, min);
                }
            }
            if (Objects.nonNull(root.right)) {
                result = root.val < root.right.val;
                if (result) {
                    isValid(root.right, max, root.val);
                }
            }
        }
    }
}