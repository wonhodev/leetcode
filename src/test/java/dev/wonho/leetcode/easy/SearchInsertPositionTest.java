package dev.wonho.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SearchInsertPositionTest {

    private final SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @Test
    public void test_Example1() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;

        assertThat(searchInsertPosition.searchInsert(nums, target))
                .as("nums: " + Arrays.toString(nums) + ", target: " + target)
                .isEqualTo(2);
    }

    @Test
    public void test_Example2() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 2;

        assertThat(searchInsertPosition.searchInsert(nums, target))
                .as("nums: " + Arrays.toString(nums) + ", target: " + target)
                .isOne();
    }

    @Test
    public void test_Example3() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 7;

        assertThat(searchInsertPosition.searchInsert(nums, target))
                .as("nums: " + Arrays.toString(nums) + ", target: " + target)
                .isEqualTo(4);
    }

    @Test
    public void test_Example4() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 0;

        assertThat(searchInsertPosition.searchInsert(nums, target))
                .as("nums: " + Arrays.toString(nums) + ", target: " + target)
                .isZero();
    }

    @Test
    public void test_NullOrEmpty() {
        int[] nums = { };
        int target = 0;

        assertThat(searchInsertPosition.searchInsert(nums, target))
                .as("nums: { }, target: " + target)
                .isZero();

        nums = null;

        assertThat(searchInsertPosition.searchInsert(nums, target))
                .as("nums: null, target: " + target)
                .isZero();
    }

}