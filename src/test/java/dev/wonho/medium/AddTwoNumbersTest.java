package dev.wonho.medium;

import dev.wonho.common.ListNode;
import dev.wonho.common.SortedList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void test_Example() {
        ListNode l1 = SortedList.createList(2, 4, 3);
        ListNode l2 = SortedList.createList(5, 6, 4);
        ListNode output = SortedList.createList(7, 0, 8);

        assertThat(SortedList.toString(addTwoNumbers.addTwoNumbers(l1, l2)))
                .as(SortedList.toString(l1) + SortedList.toString(l2))
                .isEqualTo(SortedList.toString(output));
    }

    @Test
    public void test_DifferentLength() {
        ListNode l1 = SortedList.createList(2, 4, 3);
        ListNode l2 = SortedList.createList(5, 8);
        ListNode output = SortedList.createList(7, 2, 4);

        assertThat(SortedList.toString(addTwoNumbers.addTwoNumbers(l1, l2)))
                .as(SortedList.toString(l1) + SortedList.toString(l2))
                .isEqualTo(SortedList.toString(output));
    }

    @Test
    public void test_HasExtraCarry() {
        ListNode l1 = SortedList.createList(9, 9);
        ListNode l2 = SortedList.createList(1);
        ListNode output = SortedList.createList(0, 0, 1);

        assertThat(SortedList.toString(addTwoNumbers.addTwoNumbers(l1, l2)))
                .as(SortedList.toString(l1) + SortedList.toString(l2))
                .isEqualTo(SortedList.toString(output));
    }

    @Test
    public void test_HasMoreExtraCarry() {
        ListNode l1 = SortedList.createList(7, 8, 9);
        ListNode l2 = SortedList.createList(2, 7, 2);
        ListNode output = SortedList.createList(9, 5, 2, 1);

        assertThat(SortedList.toString(addTwoNumbers.addTwoNumbers(l1, l2)))
                .as(SortedList.toString(l1) + SortedList.toString(l2))
                .isEqualTo(SortedList.toString(output));
    }

    @Test
    public void test_HasNullOrEmpty() {
        // Null, Null
        ListNode l1 = null;
        ListNode l2 = null;

        assertThat(SortedList.toString(addTwoNumbers.addTwoNumbers(l1, l2)))
                .as(l1 + " " + l2)
                .isEqualTo(null);

        // Null
        l1 = SortedList.createList(2, 4, 3);

        assertThat(SortedList.toString(addTwoNumbers.addTwoNumbers(l1, l2)))
                .as(SortedList.toString(l1) + " " + l2)
                .isEqualTo(SortedList.toString(l1));

        // Empty
        l2 = SortedList.createList();

        assertThat(SortedList.toString(addTwoNumbers.addTwoNumbers(l1, l2)))
                .as(SortedList.toString(l1) + " " + l2)
                .isEqualTo(SortedList.toString(l1));
    }

}