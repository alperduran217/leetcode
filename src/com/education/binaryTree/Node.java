package com.education.binaryTree;

public class Node {
    int val;
    Node left;
    Node right;
    Node next;


    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
