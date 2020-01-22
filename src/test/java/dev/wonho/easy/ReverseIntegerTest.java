package dev.wonho.easy;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseIntegerTest {

    private ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void test_Positive() {
        int num = 123;
        assertThat(reverseInteger.reverse(num))
                .as("Input: " + num)
                .isEqualTo(321);
    }

    @Test
    public void test_Negative() {
        int num = -123;
        assertThat(reverseInteger.reverse(num))
                .as("Input: " + num)
                .isEqualTo(-321);
    }

    @Test
    public void test_Overflow() {
        int num = 1534236469;
        assertThat(reverseInteger.reverse(num))
                .as("Input: " + num + ", " + Integer.MAX_VALUE)
                .isEqualTo(0);
    }

    @Test
    public void test_Zero() {
        int num = 0;
        int result = reverseInteger.reverse(num);
        assertThat(result)
                .as("Input: " + num)
                .isEqualTo(0);
    }

    @Test
    public void test_OneDigit() {
        int num = 4;
        int result = reverseInteger.reverse(num);
        assertThat(result)
                .as("Input: " + num)
                .isEqualTo(4);
    }

    @Test
    public void test_LastDigit_Zero() {
        int num = 120;
        int result = reverseInteger.reverse(num);
        assertThat(result)
                .as("Input: " + num)
                .isEqualTo(21);
    }

    @Test
    public void test_Negative_LastDigit_Zero() {
        int num = -120;
        int result = reverseInteger.reverse(num);
        assertThat(result)
                .as("Input: " + num)
                .isEqualTo(-21);
    }

}