package dev.wonho.leetcode.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        return Arrays.toString(toArray(head));
    }

    public static int[] toArray(ListNode head) {
        if (head == null) {
            return null;
        }

        List<Integer> list = new ArrayList<>();

        ListNode current = head;
        while (current.next != null) {
            list.add(current.val);
            current = current.next;
        }
        list.add(current.val);

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

}
