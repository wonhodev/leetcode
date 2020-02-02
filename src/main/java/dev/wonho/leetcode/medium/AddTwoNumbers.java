package dev.wonho.leetcode.medium;

import dev.wonho.leetcode.common.ListNode;

/*
https://leetcode.com/problems/add-two-numbers/

2. Add Two Numbers
Medium

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:
    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        int num1;
        int num2;
        int sum;
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode current = head;
        while (l1 != null || l2 != null) {
            num1 = (l1 == null) ? 0 : l1.val;
            num2 = (l2 == null) ? 0 : l2.val;
            sum = num1 + num2 + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return head.next;
    }

}
