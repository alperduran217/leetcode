package com.education.linkedList;

import java.util.Objects;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class ReverseList {
    public static void main(String[] args) {
        ListNode test0 = reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
    }

    public static ListNode reverseList(ListNode head) {
        if (Objects.isNull(head)) {
            return null;
        }
        ListNode currentHead = head;
        while (head.next != null) {
            ListNode p = head.next;
            head.next = p.next;
            p.next = currentHead;
            currentHead = p;
        }
        return currentHead;
    }
}