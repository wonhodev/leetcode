package dev.wonho.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveElementTest {

    private final RemoveElement removeElement = new RemoveElement();

    @Test
    public void test_Example1() {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        String input = "nums: " + Arrays.toString(nums) + ", val: " + val;

        int length = removeElement.removeElement(nums, val);
        assertThat(length).as(input).isEqualTo(2);
        assertThat(Arrays.copyOf(nums, length)).as(input).containsExactly(2, 2);
    }

    @Test
    public void test_Example2() {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;

        String input = "nums: " + Arrays.toString(nums) + ", val: " + val;

        int length = removeElement.removeElement(nums, val);
        assertThat(length).as(input).isEqualTo(5);
        assertThat(Arrays.copyOf(nums, length)).as(input).containsExactly(0, 1, 3, 0, 4);
    }

    @Test
    public void test_NullOrEmpty() {
        int[] nums = { };
        int val = 0;
        assertThat(removeElement.removeElement(nums, val)).as("{ }").isZero();

        nums = null;
        assertThat(removeElement.removeElement(nums, val)).as("null").isZero();
    }

    @Test
    public void test_OnlyOneElementWithValueInArray() {
        int[] nums = { 1 };
        int val = 1;

        String input = "nums: " + Arrays.toString(nums) + ", val: " + val;

        assertThat(removeElement.removeElement(nums, val)).as(input).isZero();
    }

    @Test
    public void test_OnlyOneElementWithValueNotInArray() {
        int[] nums = { 1 };
        int val = 0;

        String input = "nums: " + Arrays.toString(nums) + ", val: " + val;

        assertThat(removeElement.removeElement(nums, val)).as(input).isOne();
        assertThat(nums).as(input).containsExactly(1);
    }

    @Test
    public void test_AllEqualElementsWithValueInArray() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1};
        int val = 1;

        String input = "nums: " + Arrays.toString(nums) + ", val: " + val;

        int length = removeElement.removeElement(nums, val);

        assertThat(length).as(input).isZero();
        assertThat(Arrays.copyOf(nums, length)).as(input).containsExactly();
    }

    @Test
    public void test_AllEqualElementsWithValueNotInArray() {
        int[] nums = {1, 1, 1};
        int val = 0;

        String input = "nums: " + Arrays.toString(nums) + ", val: " + val;

        int length = removeElement.removeElement(nums, val);

        assertThat(length).as(input).isEqualTo(3);
        assertThat(Arrays.copyOf(nums, length)).as(input).containsExactly(1, 1, 1);
    }

    @Test
    public void test_AllNotEqualElementsWithValueInArray() {
        int[] nums = {1, 2, 3, 4, 5};
        int val = 1;

        String input = "nums: " + Arrays.toString(nums) + ", val: " + val;

        int length = removeElement.removeElement(nums, val);

        assertThat(length).as(input).isEqualTo(4);
        assertThat(Arrays.copyOf(nums, length)).as(input).containsExactly(2, 3, 4, 5);
    }

    @Test
    public void test_AllNotEqualElementsWithValueNotInArray() {
        int[] nums = {1, 2, 3, 4, 5};
        int val = 0;

        String input = "nums: " + Arrays.toString(nums) + ", val: " + val;

        int length = removeElement.removeElement(nums, val);

        assertThat(length).as(input).isEqualTo(5);
        assertThat(Arrays.copyOf(nums, length)).as(input).containsExactly(1, 2, 3, 4, 5);
    }

}