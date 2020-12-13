package com.education.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                3,
                new TreeNode(9, null, null), new TreeNode(20,
                new TreeNode(15, null, null), new TreeNode(7, null, null)));

        List<List<Integer>> lists = levelOrder(root);

    }

    static List<List<Integer>> levels = new ArrayList<>();

    public static void helper(TreeNode node, int level) {
        if (levels.size() == level)
            levels.add(new ArrayList<>());

        levels.get(level).add(node.val);

        if (node.left != null)
            helper(node.left, level + 1);
        if (node.right != null)
            helper(node.right, level + 1);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return levels;
        helper(root, 0);
        return levels;
    }
}
