package dev.wonho.leetcode.easy;

import dev.wonho.leetcode.common.ListNode;
import dev.wonho.leetcode.common.SortedList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsTest {

    private MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    public void test_Example() {
        ListNode list1 = SortedList.createList(1, 2, 4);
        ListNode list2 = SortedList.createList(1, 3, 4);
        ListNode mergedList = SortedList.createList(1, 1, 2, 3, 4, 4);

        String string1 = SortedList.toString(list1);
        String string2 = SortedList.toString(list2);

        assertThat(SortedList.toString(mergeTwoSortedLists.mergeTwoLists(list1, list2)))
                .as(string1 + string2)
                .isEqualTo(SortedList.toString(mergedList));
    }

    @Test
    public void test_DifferentLength() {
        ListNode list1 = SortedList.createList(1, 3, 4, 5);
        ListNode list2 = SortedList.createList(1, 2, 3, 5, 8, 10);
        ListNode mergedList = SortedList.createList(1, 1, 2, 3, 3, 4, 5, 5, 8, 10);

        String string1 = SortedList.toString(list1);
        String string2 = SortedList.toString(list2);

        assertThat(SortedList.toString(mergeTwoSortedLists.mergeTwoLists(list1, list2)))
                .as(string1 + string2)
                .isEqualTo(SortedList.toString(mergedList));
    }

    @Test
    public void test_HasNullOrEmpty() {
        // Null, Null
        ListNode list1 = null;
        ListNode list2 = null;

        assertThat(SortedList.toString(mergeTwoSortedLists.mergeTwoLists(list1, list2)))
                .as(list1 + " " + list2)
                .isNull();

        // Null
        list1 = SortedList.createList(1, 2, 4);

        assertThat(SortedList.toString(mergeTwoSortedLists.mergeTwoLists(list1, list2)))
                .as(SortedList.toString(list1) + " " + list2)
                .isEqualTo(SortedList.toString(list1));

        // Empty
        list2 = SortedList.createList();

        assertThat(SortedList.toString(mergeTwoSortedLists.mergeTwoLists(list1, list2)))
                .as(SortedList.toString(list1) + " " + list2)
                .isEqualTo(SortedList.toString(list1));
    }

}