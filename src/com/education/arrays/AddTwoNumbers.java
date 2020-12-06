package com.education.arrays;

import java.util.Objects;

class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return recrusive(l1, l2, new ListNode(), 0);
    }

    public static ListNode recrusive(ListNode l1, ListNode l2, ListNode result, int remainder) {
        if (Objects.nonNull(l1) && Objects.nonNull(l2) && Objects.nonNull(result)) {
            int sum = l1.val + l2.val;
            if (remainder > 0) {
                sum++;
            }
            int nextRem = 0;
            if (sum >= 10) {
                nextRem++;
                sum = sum - 10;
            }
            if(Objects.nonNull(l1.next) && Objects.isNull(l2.next)){
                return new ListNode(sum, recrusive(l1.next, new ListNode(0), result, nextRem));
            } else if(Objects.isNull(l1.next) && Objects.nonNull(l2.next)) {
                return new ListNode(sum, recrusive(new ListNode(0), l2.next, result, nextRem));
            }
            return new ListNode(sum, recrusive(l1.next, l2.next, result, nextRem));
        } else if(remainder > 0){
            return new ListNode(remainder);
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l4 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result2 = addTwoNumbers(l3, l4);
    }

}
