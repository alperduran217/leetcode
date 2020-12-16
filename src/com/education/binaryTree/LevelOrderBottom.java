package com.education.binaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

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
public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(Objects.isNull(root)){
            return result;
        }
        Queue<TreeNode> stack = new LinkedList<>();

        stack.add(root);

        while (!stack.isEmpty()) {
            int size = stack.size();
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode currentTree = stack.remove();

                if (Objects.nonNull(currentTree.right)) {
                    stack.add(currentTree.right);
                }

                if (Objects.nonNull(currentTree.left)) {
                    stack.add(currentTree.left);
                }

                integers.add(currentTree.val);
            }

            result.add(integers);

        }

        Collections.reverse(result);
        return result;

    }
}