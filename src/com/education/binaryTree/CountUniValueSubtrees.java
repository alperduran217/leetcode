package com.education.binaryTree;

import java.util.Objects;

public class CountUniValueSubtrees {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                5,
                new TreeNode(1, new TreeNode(5, null, null), new TreeNode(5, null, null)),
                new TreeNode(5, null, new TreeNode(5, null, null)));
        TreeNode root1 = new TreeNode(5, new TreeNode(5, null, null), new TreeNode(1, null, null));
        int test0 = countUnivalSubtrees(root);
        int test1 = countUnivalSubtrees(root1);

    }

    private static int count;

    public static int countUnivalSubtrees(TreeNode root) {
        if (root == null) return 0;
        count = 0;
        findUniValSubTrees(root, -1);
        return count;
    }

    private static boolean findUniValSubTrees(TreeNode child, int parentVal) {
        if (Objects.isNull(child)) {
            return true;
        }

        boolean left = findUniValSubTrees(child.left, child.val);
        boolean right = findUniValSubTrees(child.right, child.val);

        if (left && right) {
            count++;
            return child.val == parentVal;
        }

        return false;
    }
}
