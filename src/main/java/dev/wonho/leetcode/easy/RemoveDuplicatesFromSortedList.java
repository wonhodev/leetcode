package dev.wonho.leetcode.easy;

import dev.wonho.leetcode.common.ListNode;

/*
83. Remove Duplicates from Sorted List
Easy

Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:
    Input: 1->1->2
    Output: 1->2

Example 2:
    Input: 1->1->2->3->3
    Output: 1->2->3
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

}
