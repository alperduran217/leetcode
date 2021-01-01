package com.education.binaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
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
public class BoundaryOfBinaryTree {
    public static void main(String[] args) {
        List<Integer> test1 = boundaryOfBinaryTree(new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), new TreeNode(5)), new TreeNode(7, null, new TreeNode(6))));
        List<Integer> test0 = boundaryOfBinaryTree(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(7), new TreeNode(8))), new TreeNode(3, new TreeNode(6, new TreeNode(9), new TreeNode(10)), null)));
    }

    public static List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queueLeft = new LinkedList<>();
        Queue<TreeNode> queueRight = new LinkedList<>();


        result.add(root.val);

        List<Integer> left = recursive(root.left, new ArrayList<>(), Direction.LEFT, queueLeft);
        List<Integer> right = recursive(root.right, new ArrayList<>(), Direction.RIGHT, queueRight);

        Collections.reverse(right);

        result.addAll(left);
        result.addAll(right);

        return result;

    }

    public static List<Integer> recursive(TreeNode root, List<Integer> result, Direction direction, Queue<TreeNode> queue) {
        if (root != null) {
            queue.add(root);
            result.add(root.val);
            while (!queue.isEmpty()) {
                int size = queue.size();

                for (int i = 0; i < size; i++) {
                    TreeNode currentNode = queue.poll();
                    if (direction == Direction.LEFT) {
                        if (currentNode.left != null) {
                            queue.add(currentNode.left);
                            result.add(currentNode.left.val);
                        }
                        if (currentNode.right != null) {
                            queue.add(currentNode.right);

                            if (currentNode.right.left == null && currentNode.right.right == null || currentNode.left == null) {
                                result.add(currentNode.right.val);
                            }
                        }
                    } else if (direction == Direction.RIGHT) {
                        if (currentNode.right != null) {
                            queue.add(currentNode.right);
                            result.add(currentNode.right.val);
                        }

                        if (currentNode.left != null) {
                            queue.add(currentNode.left);
                            if (currentNode.left.right == null && currentNode.left.left == null || currentNode.right == null) {
                                result.add(currentNode.left.val);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    enum Direction {
        LEFT,
        RIGHT
    }

}