package dev.wonho.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumSubarrayTest {

    private final MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    public void test_Example() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        assertThat(maximumSubarray.maxSubArray(nums))
                .as(Arrays.toString(nums))
                .isEqualTo(6);
    }

    @Test
    public void test_NullOrEmpty() {
        int[] nums = {};
        assertThat(maximumSubarray.maxSubArray(nums)).as("{}").isZero();

        nums = null;
        assertThat(maximumSubarray.maxSubArray(nums)).as("null").isZero();
    }

    @Test
    public void test_AllPositive() {
        int[] nums = {1, 2, 3, 4, 5};

        assertThat(maximumSubarray.maxSubArray(nums))
                .as(Arrays.toString(nums))
                .isEqualTo(15);
    }

    @Test
    public void test_OneNegative() {
        int[] nums = {1, 2, -3, 4, 5};

        assertThat(maximumSubarray.maxSubArray(nums))
                .as(Arrays.toString(nums))
                .isEqualTo(9);
    }

    @Test
    public void test_AllNegative() {
        int[] nums = {-1, -2, -3, -4, -5};

        assertThat(maximumSubarray.maxSubArray(nums))
                .as(Arrays.toString(nums))
                .isEqualTo(-1);
    }

    @Test
    public void test_OneElement() {
        int[] nums = {4};
        assertThat(maximumSubarray.maxSubArray(nums)).as(Arrays.toString(nums)).isEqualTo(4);

        nums[0] = -4;
        assertThat(maximumSubarray.maxSubArray(nums)).as(Arrays.toString(nums)).isEqualTo(-4);
    }

}