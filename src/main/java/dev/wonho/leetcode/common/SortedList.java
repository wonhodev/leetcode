package dev.wonho.leetcode.common;

public class SortedList {

    public static ListNode createList(int... values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode head = new ListNode(values[0]);

        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    public static String toString(ListNode head) {
        if (head == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        ListNode current = head;

        while (current.next != null) {
            sb.append(current.val);
            sb.append(", ");

            current = current.next;
        }
        sb.append(current.val);
        sb.append("]");

        return sb.toString();
    }

}
