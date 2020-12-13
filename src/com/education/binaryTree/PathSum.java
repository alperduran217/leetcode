package com.education.binaryTree;

import java.util.Objects;

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7, null, null), new TreeNode(2, null, null)), null),
                new TreeNode(8, new TreeNode(13, null, null), new TreeNode(4, null, new TreeNode(1, null, null))));
        TreeNode root1 = new TreeNode(1, null, null);
        boolean test1 = hasPathSum(root1, 0);
        boolean test0 = hasPathSum(root, 22);

    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (Objects.isNull(root))
            return false;

        sum -= root.val;
        if ((Objects.isNull(root.left)) && (Objects.isNull(root.right)))
            return (sum == 0);
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}
