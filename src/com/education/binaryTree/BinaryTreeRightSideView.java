package com.education.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

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
public class BinaryTreeRightSideView {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), null), new TreeNode(3, null, null));
        TreeNode root1 = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        TreeNode root2 = new TreeNode(4, new TreeNode(3, new TreeNode(1, null, new TreeNode(2, null, null)), null), new TreeNode(6, new TreeNode(5, null, null), null));
        List<Integer> test2 = rightSideView(root2);
        List<Integer> test1 = rightSideView(root1);
        List<Integer> test0 = rightSideView(root);

    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (Objects.isNull(root)) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currentRoot = queue.remove();
                if (i == size - 1) {
                    result.add(currentRoot.val);
                }

                if (Objects.nonNull(currentRoot.left)) {
                    queue.add(currentRoot.left);
                }

                if (Objects.nonNull(currentRoot.right)) {
                    queue.add(currentRoot.right);
                }
            }
        }
        return result;
    }
}