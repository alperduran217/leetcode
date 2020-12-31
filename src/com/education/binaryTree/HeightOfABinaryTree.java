package com.education.binaryTree;

import java.util.Objects;

public class HeightOfABinaryTree {

    public static void main(String[] args) {
        int test0 = height(new TreeNode(4, new TreeNode(1, new TreeNode(10), new TreeNode(9)), new TreeNode(8, new TreeNode(3), null)));
    }

    public static int height(TreeNode root) {
        return findHeight(root, 0, 0);
    }

    public static int findHeight(TreeNode root, int left, int right){
        if(Objects.nonNull(root)){
            if(Objects.nonNull(root.left)){
                left = findHeight(root.left, left + 1, right);
            }

            if(Objects.nonNull(root.right)){
                right = findHeight(root.right, left, right + 1);
            }

        }
        return Math.max(left,right);
    }
}
