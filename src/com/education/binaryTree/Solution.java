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
class FindAllTheLonelyNodes {
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (Objects.isNull(root)) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();

            if (Objects.nonNull(currentNode.left)) {
                queue.add(currentNode.left);
                if (Objects.isNull(currentNode.right)) {
                    result.add(currentNode.left.val);
                }
            }

            if (Objects.nonNull(currentNode.right)) {
                queue.add(currentNode.right);
                if (Objects.isNull(currentNode.left)) {
                    result.add(currentNode.right.val);
                }
            }

        }

        return result;
    }
}