package com.education.binaryTree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class BinaryTreeZigzagLevelOrderTraversal {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), null), new TreeNode(3, null, new TreeNode(5, null, null)));
        List<List<Integer>> test0 = zigzagLevelOrder(root);
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (Objects.isNull(root)) {
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addFirst(root);
        boolean zigzag = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode currentNode;
                if (zigzag) {
                    currentNode = queue.removeFirst();
                    integers.add(currentNode.val);

                    if (Objects.nonNull(currentNode.left)) {
                        queue.addLast(currentNode.left);
                    }
                    if (Objects.nonNull(currentNode.right)) {
                        queue.addLast(currentNode.right);
                    }
                } else {
                    currentNode = queue.removeLast();
                    integers.add(currentNode.val);
                    if (Objects.nonNull(currentNode.right)) {
                        queue.addFirst(currentNode.right);
                    }
                    if (Objects.nonNull(currentNode.left)) {
                        queue.addFirst(currentNode.left);
                    }
                }
            }
            zigzag = !zigzag;
            result.add(integers);
        }
        return result;
    }
}