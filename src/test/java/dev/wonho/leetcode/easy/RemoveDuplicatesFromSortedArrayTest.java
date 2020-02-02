package dev.wonho.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray removeDuplicates = new RemoveDuplicatesFromSortedArray();

    @Test
    public void test_Example1() {
        int[] nums = { 1, 1, 2 };
        String input = Arrays.toString(nums);
        int length = removeDuplicates.removeDuplicates(nums);

        assertThat(length).as(input).isEqualTo(2);
        assertThat(Arrays.copyOf(nums, length)).as(input).containsExactly(1, 2);
    }

    @Test
    public void test_Example2() {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        String input = Arrays.toString(nums);
        int length = removeDuplicates.removeDuplicates(nums);

        assertThat(length).as(input).isEqualTo(5);
        assertThat(Arrays.copyOf(nums, length)).as(input).containsExactly(0, 1, 2, 3, 4);
    }

    @Test
    public void test_NullOrEmpty() {
        int[] nums = { };
        assertThat(removeDuplicates.removeDuplicates(nums)).as("{ }").isZero();

        nums = null;
        assertThat(removeDuplicates.removeDuplicates(nums)).as("null").isZero();
    }

    @Test
    public void test_OnlyOneElement() {
        int[] nums = { 1 };
        String input = Arrays.toString(nums);

        assertThat(removeDuplicates.removeDuplicates(nums)).as(input).isOne();
        assertThat(nums).as(input).containsExactly(1);
    }

    @Test
    public void test_AllEqualElements() {
        int[] nums = { 1, 1, 1, 1, 1, 1, 1 };
        String input = Arrays.toString(nums);
        int length = removeDuplicates.removeDuplicates(nums);

        assertThat(length).as(input).isOne();
        assertThat(Arrays.copyOf(nums, length)).as(input).containsExactly(1);
    }

    @Test
    public void test_AllNotEqualElements() {
        int[] nums = { 1, 2, 3, 4, 5 };
        String input = Arrays.toString(nums);
        int length = removeDuplicates.removeDuplicates(nums);

        assertThat(length).as(input).isEqualTo(5);
        assertThat(Arrays.copyOf(nums, length)).as(input).containsExactly(1, 2, 3, 4, 5);
    }

}