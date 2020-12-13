package com.education.binaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BinaryTreePreOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        TreeNode root1 = new TreeNode(3, new TreeNode(1, null, null), new TreeNode(2, null, null));
        List<Integer> test1 = preorderTraversal(root1);
        List<Integer> test0 = preorderTraversal(root);
        List<Integer> inorderTest2 = inorderTraversal(root1);
        List<Integer> inorderTest1 = inorderTraversal(new TreeNode());
        List<Integer> inorderTest0 = inorderTraversal(root);
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> integerList = new ArrayList<>();
        return recursive(integerList, root);
    }

    public static List<Integer> recursive(List<Integer> integerList, TreeNode tree) {
        if (Objects.nonNull(tree)) {
            integerList.add(tree.val);
            if (Objects.nonNull(tree.left)) {
                integerList.addAll(recursive(new ArrayList<>(), tree.left));
            }
            if (Objects.nonNull(tree.right)) {
                integerList.addAll(recursive(new ArrayList<>(), tree.right));
            }
        }
        return integerList;
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> integerList = new ArrayList<>();
        if (Objects.isNull(root)) {
            return Collections.emptyList();
        }
        return inorderRecursive(integerList, root);
    }

    static List<Integer> inorderRecursive(List<Integer> integerList, TreeNode tree) {
        if (Objects.nonNull(tree)) {
            if (Objects.nonNull(tree.left)) {
                integerList.addAll(inorderRecursive(new ArrayList<>(), tree.left));
            }
            integerList.add(tree.val);
            if (Objects.nonNull(tree.right)) {
                integerList.addAll(inorderRecursive(new ArrayList<>(), tree.right));
            }
        }
        return integerList;
    }
}
