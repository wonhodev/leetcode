package dev.wonho.common;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SortedListTest {

    @Test
    public void test_createList() {
        int[] input = { 1, 2, 4 };
        ListNode list = SortedList.createList(input);

        assertThat(list.val).as("1, 2, 4: " + list.val).isEqualTo(1);

        list = list.next;
        assertThat(list.val).as("1, 2, 4: " + list.val).isEqualTo(2);

        list = list.next;
        assertThat(list.val).as("1, 2, 4: " + list.val).isEqualTo(4);
    }

    @Test
    public void test_createList_Null() {
        assertThat(SortedList.createList(null))
                .as("null")
                .isNull();
    }

    @Test
    public void test_createList_Empty() {
        int[] input = { };

        assertThat(SortedList.createList(input))
                .as("{ }")
                .isNull();
    }

    @Test
    public void test_toString() {
        int[] input = { 1, 2, 4 };
        ListNode list = SortedList.createList(input);

        assertThat(SortedList.toString(list))
                .as(Arrays.toString(input))
                .isEqualTo(Arrays.toString(input));
    }

    @Test
    public void test_toString_Null() {
        assertThat(SortedList.toString(null))
                .as("null")
                .isNull();
    }

    @Test
    public void test_toString_Empty() {
        int[] input = { };
        ListNode list = SortedList.createList(input);

        assertThat(SortedList.toString(list)).as("{ }").isNull();

        list = SortedList.createList();
        assertThat(SortedList.toString(list)).isNull();
    }

}