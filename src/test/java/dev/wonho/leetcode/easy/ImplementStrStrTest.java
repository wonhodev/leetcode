package dev.wonho.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ImplementStrStrTest {

    private final ImplementStrStr implementStrStr = new ImplementStrStr();

    @Test
    public void test_Example1() {
        String haystack = "hello";
        String needle = "ll";

        assertThat(implementStrStr.strStr(haystack, needle))
                .as("Haystack: " + haystack + ", Needle: " + needle)
                .isEqualTo(2);
    }

    @Test
    public void test_Example2() {
        String haystack = "aaaaa";
        String needle = "bba";

        assertThat(implementStrStr.strStr(haystack, needle))
                .as("Haystack: " + haystack + ", Needle: " + needle)
                .isEqualTo(-1);
    }

    @Test
    public void test_Example3() {
        String haystack = "mississippi";
        String needle = "issipi";

        assertThat(implementStrStr.strStr(haystack, needle))
                .as("Haystack: " + haystack + ", Needle: " + needle)
                .isEqualTo(-1);
    }

    @Test
    public void test_HaystackNullOrEmpty() {
        String haystack = null;
        String needle = "abc";
        assertThat(implementStrStr.strStr(haystack, needle))
                .as("Haystack: null, Needle: " + needle)
                .isEqualTo(-1);

        haystack = "";
        assertThat(implementStrStr.strStr(haystack, needle))
                .as("Haystack: " + haystack + ", Needle: " + needle)
                .isEqualTo(-1);
    }

    @Test
    public void test_NeedleNullOrEmpty() {
        String haystack = "abc";
        String needle = null;
        assertThat(implementStrStr.strStr(haystack, needle))
                .as("Haystack: " + haystack + ", Needle: null")
                .isEqualTo(-1);

        needle = "";
        assertThat(implementStrStr.strStr(haystack, needle))
                .as("Haystack: " + haystack + ", Needle: " + needle)
                .isZero();
    }

    @Test
    public void test_BothNullOrEmpty() {
        String haystack = null;
        String needle = null;
        assertThat(implementStrStr.strStr(haystack, needle))
                .as("Haystack: null, Needle: null")
                .isEqualTo(-1);

        haystack = "";
        needle = "";
        assertThat(implementStrStr.strStr(haystack, needle))
                .as("Haystack: " + haystack + ", Needle: " + needle)
                .isZero();
    }

    @Test
    public void test_EqualHaystackAndNeedle() {
        String haystack = "abc";
        String needle = "abc";
        assertThat(implementStrStr.strStr(haystack, needle))
                .as("Haystack: " + haystack + ", Needle: " + needle)
                .isZero();
    }

    @Test
    public void test_NeedleLongerThanHaystack() {
        String haystack = "abc";
        String needle = "abcde";
        assertThat(implementStrStr.strStr(haystack, needle))
                .as("Haystack: " + haystack + ", Needle: " + needle)
                .isEqualTo(-1);
    }

}