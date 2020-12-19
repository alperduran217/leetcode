package com.education.binaryTree;

import java.util.ArrayList;
import java.util.List;
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
public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5, null, null)), new TreeNode(3, null, null));
        List<String> stringList = binaryTreePaths(root);
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        if (Objects.isNull(root)) {
            return result;
        }
        postOrder(root, "");

        return result;
    }

    static List<String> result = new ArrayList<>();


    public static void postOrder(TreeNode root, String val) {
        if (Objects.nonNull(root)) {
            val += root.val;
            val += "->";

            if (Objects.nonNull(root.left)) {
                postOrder(root.left, val);
            }

            if (Objects.nonNull(root.right)) {
                postOrder(root.right, val);
            }
        }

        if (Objects.isNull(root.left) && Objects.isNull(root.right)) {
            result.add(val.substring(0, val.length() - 2));
        }
    }
}