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
public class LeafSimilarTrees {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3, new TreeNode(5, new TreeNode(6, null, null), new TreeNode(2, new TreeNode(7, null, null), new TreeNode(4, null, null))), new TreeNode(1, new TreeNode(9, null, null), new TreeNode(8, null, null)));
        TreeNode root2 = new TreeNode(3, new TreeNode(5, new TreeNode(6, null, null), new TreeNode(7, null, null)), new TreeNode(1, new TreeNode(4, null, null), new TreeNode(2, new TreeNode(9, null, null), new TreeNode(8, null, null))));
        boolean test0 = leafSimilar(root1, root2);
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        recursive(root1, result1);
        recursive(root2, result2);
        return result1.equals(result2);
    }

    public static void recursive(TreeNode root, List<Integer> result) {
        if (Objects.nonNull(root)) {
            if (Objects.isNull(root.left) && Objects.isNull(root.right)) {
                result.add(root.val);
            }
            recursive(root.left, result);
            recursive(root.right, result);

        }
    }

}