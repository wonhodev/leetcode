package dev.wonho.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void test_Negative() {
        int input = -121;
        assertThat(palindromeNumber.isPalindrome(input))
                .as("Input: " + input)
                .isFalse();
    }

    @Test
    public void test_Zero() {
        int input = 0;
        assertThat(palindromeNumber.isPalindrome(input))
                .as("Input: " + input)
                .isTrue();
    }

    @Test
    public void test_OneDigit() {
        int input = 4;
        assertThat(palindromeNumber.isPalindrome(input))
                .as("Input: " + input)
                .isTrue();
    }

    @Test
    public void test_Examples_True() {
        int input = 121;
        assertThat(palindromeNumber.isPalindrome(input)).as("Input: " + input).isTrue();

        input = 1221;
        assertThat(palindromeNumber.isPalindrome(input)).as("Input: " + input).isTrue();

        input = 2649462;
        assertThat(palindromeNumber.isPalindrome(input)).as("Input: " + input).isTrue();

        input = 26499462;
        assertThat(palindromeNumber.isPalindrome(input)).as("Input: " + input).isTrue();
    }

    @Test
    public void test_Examples_False() {
        int input = 10;
        assertThat(palindromeNumber.isPalindrome(input)).as("Input: " + input).isFalse();

        input = 123;
        assertThat(palindromeNumber.isPalindrome(input)).as("Input: " + input).isFalse();

        input = 1011;
        assertThat(palindromeNumber.isPalindrome(input)).as("Input: " + input).isFalse();

        input = 26498462;
        assertThat(palindromeNumber.isPalindrome(input)).as("Input: " + input).isFalse();
    }

}