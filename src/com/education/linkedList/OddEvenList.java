package com.education.linkedList;

import java.util.Objects;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class OddEvenList {
    public static void main(String[] args) {
        ListNode test0 = oddEvenList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static ListNode recursive(ListNode head) {
        if (Objects.nonNull(head)) {
            if (Objects.nonNull(head.next)) {
                if (Objects.nonNull(head.next.next)) {
                    head.next = recursive(head.next.next);
                } else {
                    head.next = null;
                }
            }
        }
        return head;
    }
}