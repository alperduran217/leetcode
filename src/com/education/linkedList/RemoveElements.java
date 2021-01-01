package com.education.linkedList;

public class RemoveElements {
    public static void main(String[] args) {
        ListNode test0 = removeElements(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))))), 6);
    }
    public static ListNode removeElements(ListNode head, int val) {
        if (head != null) {
            ListNode h = removeElements(head.next, val);
            if (head.val == val) {
                return h;
            } else {
                head.next = h;
            }
        }
        return head;
    }
}