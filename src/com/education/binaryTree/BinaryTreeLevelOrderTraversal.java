package com.education.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                3,
                new TreeNode(9, null, null), new TreeNode(20,
                new TreeNode(15, null, null), new TreeNode(7, null, null)));

        List<List<Integer>> lists = levelOrder(root);

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (Objects.isNull(root)) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode currentRoot = queue.remove();
                currentLevel.add(currentRoot.val);

                if (Objects.nonNull(currentRoot.left)) {
                    queue.add(currentRoot.left);
                }

                if (Objects.nonNull(currentRoot.right)) {
                    queue.add(currentRoot.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}
