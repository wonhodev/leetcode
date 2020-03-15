package dev.wonho.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortedArrayTest {

    private final MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    public void test_Example() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        String input = Arrays.toString(nums1) + ", " + Arrays.toString(nums2);
        mergeSortedArray.merge(nums1, m, nums2, n);

        assertThat(nums1).as(input).containsExactly(1, 2, 2, 3, 5, 6);
    }

    @Test
    public void test_OnlyNums1() {
        int[] nums1 = {1, 2, 3};
        int m = 3;
        int[] nums2 = {};
        int n = 0;

        String input = Arrays.toString(nums1) + ", " + Arrays.toString(nums2);
        mergeSortedArray.merge(nums1, m, nums2, n);

        assertThat(nums1).as(input).containsExactly(1, 2, 3);
    }

    @Test
    public void test_OnlyNums2() {
        int[] nums1 = {0, 0, 0};
        int m = 0;
        int[] nums2 = {1, 2, 3};
        int n = 3;

        String input = Arrays.toString(nums1) + ", " + Arrays.toString(nums2);
        mergeSortedArray.merge(nums1, m, nums2, n);

        assertThat(nums1).as(input).containsExactly(1, 2, 3);
    }

    @Test
    public void test_Nums1_Null() {
        int[] nums1 = null;
        int m = 0;
        int[] nums2 = {1, 2, 3};
        int n = 3;

        String input = "null, " + Arrays.toString(nums2);
        mergeSortedArray.merge(nums1, m, nums2, n);

        assertThat(nums1).as(input).isNull();
    }


    @Test
    public void test_Nums2_Null() {
        int[] nums1 = {1, 2, 3};
        int m = 3;
        int[] nums2 = null;
        int n = 0;

        String input = Arrays.toString(nums1) + ", null";
        mergeSortedArray.merge(nums1, m, nums2, n);

        assertThat(nums1).as(input).containsExactly(1, 2, 3);
    }

    @Test
    public void test_Both_NullOrEmpty() {
        // Empty
        int[] nums1 = { };
        int m = 0;
        int[] nums2 = { };
        int n = 0;

        String input = "{ }, { }";
        mergeSortedArray.merge(nums1, m, nums2, n);

        assertThat(nums1).as(input).isEmpty();

        // Null
        nums1 = null;
        nums2 = null;

        input = "null, null";
        mergeSortedArray.merge(nums1, m, nums2, n);

        assertThat(nums1).as(input).isNull();
    }

    @Test
    public void test_Nums1LongerThanNums2() {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 0, 0, 0};
        int m = 6;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        String input = Arrays.toString(nums1) + ", " + Arrays.toString(nums2);
        mergeSortedArray.merge(nums1, m, nums2, n);

        assertThat(nums1).as(input).containsExactly(1, 2, 2, 3, 4, 5, 5, 6, 6);
    }

    @Test
    public void test_Nums2LongerThanNums1() {
        int[] nums1 = {2, 5, 6, 0, 0, 0, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        int n = 6;

        String input = Arrays.toString(nums1) + ", " + Arrays.toString(nums2);
        mergeSortedArray.merge(nums1, m, nums2, n);

        assertThat(nums1).as(input).containsExactly(1, 2, 2, 3, 4, 5, 5, 6, 6);
    }
}
