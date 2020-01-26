package dev.wonho.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanToIntegerTest {

    private RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void test_Examples() {
        String input = "III";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isEqualTo(3);

        input = "IV";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isEqualTo(4);

        input = "IX";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isEqualTo(9);

        input = "LVIII";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isEqualTo(58);

        input = "MCMXCIV";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isEqualTo(1994);
    }

    @Test
    void test_GreaterThan3999() {
        String input = "MMMMCMXCIV";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isZero();
    }

    @Test
    void test_EmptyInput() {
        String input = "";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isZero();
    }

    @Test
    void test_WrongInput() {
        String input = "IIII";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isZero();

        input = "XXXX";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isZero();

        input = "CCCC";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isZero();

        input = "DDDD";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isZero();

        input = "MMMM";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isZero();

        input = "VV";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isZero();

        input = "LL";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isZero();

        input = "DD";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isZero();

        input = "AAA";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isZero();

        input = "ABC";
        assertThat(romanToInteger.romanToInt(input)).as("Input: " + input).isZero();
    }

}