package dev.wonho.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void test_Example_HasPrefix() {
        String[] input = { "flower", "flow", "flight" };
        assertThat(longestCommonPrefix.longestCommonPrefix(input))
                .as("Input: " + Arrays.asList(input))
                .isEqualTo("fl");
    }

    @Test
    public void test_Example_NoPrefix() {
        String[] input = { "dog", "racecar", "car" };
        assertThat(longestCommonPrefix.longestCommonPrefix(input))
                .as("Input: " + Arrays.asList(input))
                .isEqualTo("");
    }

    @Test
    public void test_NullOrEmpty() {
        assertThat(longestCommonPrefix.longestCommonPrefix(null)).as("Input: null").isEqualTo("");
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{})).as("Input: {}}").isEqualTo("");
    }

    @Test
    public void test_HasEmptyString() {
        String[] input = { "flower", "", "flight" };
        assertThat(longestCommonPrefix.longestCommonPrefix(input))
                .as("Input: " + Arrays.asList(input))
                .isEqualTo("");

        input[0] = "";
        input[2] = "";
        assertThat(longestCommonPrefix.longestCommonPrefix(input))
                .as("Input: " + Arrays.asList(input))
                .isEqualTo("");
    }

    @Test
    public void test_HasOneString() {
        String[] input = { "flower" };
        assertThat(longestCommonPrefix.longestCommonPrefix(input))
                .as("Input: " + Arrays.asList(input))
                .isEqualTo(input[0]);
    }

}