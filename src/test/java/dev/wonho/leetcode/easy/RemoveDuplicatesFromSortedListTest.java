package dev.wonho.leetcode.easy;

import dev.wonho.leetcode.common.ListNode;
import dev.wonho.leetcode.common.SortedList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesFromSortedListTest {

    private final RemoveDuplicatesFromSortedList removeDuplicates = new RemoveDuplicatesFromSortedList();

    @Test
    public void test_Example1() {
        ListNode head = SortedList.createList(1, 1, 2);
        String input = SortedList.toString(head);

        assertThat(SortedList.toArray(removeDuplicates.deleteDuplicates(head)))
                .as(input)
                .containsExactly(1, 2);
    }

    @Test
    public void test_Example2() {
        ListNode head = SortedList.createList(1, 1, 2, 3, 3);
        String input = SortedList.toString(head);

        assertThat(SortedList.toArray(removeDuplicates.deleteDuplicates(head)))
                .as(input)
                .containsExactly(1, 2, 3);
    }

    @Test
    public void test_Null() {
        ListNode head = null;

        assertThat(SortedList.toArray(removeDuplicates.deleteDuplicates(head)))
                .as("null")
                .isNull();
    }

    @Test
    public void test_OnlyOneElement() {
        ListNode head = SortedList.createList(3);
        String input = SortedList.toString(head);

        assertThat(SortedList.toArray(removeDuplicates.deleteDuplicates(head)))
                .as(input)
                .containsExactly(3);
    }

    @Test
    public void test_AllEqualElements() {
        ListNode head = SortedList.createList(3, 3, 3, 3, 3, 3);
        String input = SortedList.toString(head);

        assertThat(SortedList.toArray(removeDuplicates.deleteDuplicates(head)))
                .as(input)
                .containsExactly(3);
    }

    @Test
    public void test_AllNotEqualElements() {
        ListNode head = SortedList.createList(1, 2, 3, 4, 5);
        String input = SortedList.toString(head);

        assertThat(SortedList.toArray(removeDuplicates.deleteDuplicates(head)))
                .as(input)
                .containsExactly(1, 2, 3, 4, 5);
    }

}