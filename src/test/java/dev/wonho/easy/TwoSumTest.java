package dev.wonho.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    public void test_Example_Pass() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] results = twoSum.twoSum(nums, target);

        assertThat(results[0]).isEqualTo(0);
        assertThat(results[1]).isEqualTo(1);
    }

    @Test
    public void test_NotFoundElement_Fail() {
        int[] nums = { 2, 8, 11, 15 };
        int target = 9;
        int[] results = twoSum.twoSum(nums, target);

        assertThat(results[0]).isEqualTo(-1);
        assertThat(results[1]).isEqualTo(-1);
    }

    @Test
    public void test_EmptyArray_Fail() {
        int[] nums = { };
        int target = 9;
        int[] results = twoSum.twoSum(nums, target);

        assertThat(results[0]).isEqualTo(-1);
        assertThat(results[1]).isEqualTo(-1);
    }

    @Test
    public void test_TwoElement_Pass() {
        int[] nums = { 2, 4 };
        int target = 6;
        int[] results = twoSum.twoSum(nums, target);

        assertThat(results[0]).isEqualTo(0);
        assertThat(results[1]).isEqualTo(1);
    }

    @Test
    public void test_OnlySameElement_Pass() {
        int[] nums = { 3, 3 };
        int target = 6;
        int[] results = twoSum.twoSum(nums, target);

        assertThat(results[0]).isEqualTo(0);
        assertThat(results[1]).isEqualTo(1);
    }

    @Test
    public void test_HasSameElement_Pass() {
        int[] nums = { 2, 5, 5, 11 };
        int target = 10;
        int[] results = twoSum.twoSum(nums, target);

        assertThat(results[0]).isEqualTo(1);
        assertThat(results[1]).isEqualTo(2);
    }

}