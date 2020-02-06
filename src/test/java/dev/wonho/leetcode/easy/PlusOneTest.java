package dev.wonho.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class PlusOneTest {

    private final PlusOne plusOne = new PlusOne();

    @Test
    public void test_Example1() {
        int[] digits = {1, 2, 3};
        String input = Arrays.toString(digits);

        assertThat(plusOne.plusOne(digits))
                .as(input)
                .containsExactly(1, 2, 4);
    }

    @Test
    public void test_Example2() {
        int[] digits = {4, 3, 2, 1};
        String input = Arrays.toString(digits);

        assertThat(plusOne.plusOne(digits))
                .as(input)
                .containsExactly(4, 3, 2, 2);
    }

    @Test
    public void test_NullOrEmpty() {
        int[] digits = {};
        assertThat(plusOne.plusOne(digits)).as("{}").isNull();

        digits = null;
        assertThat(plusOne.plusOne(digits)).as("null").isNull();
    }

    @Test
    public void test_OneDigit() {
        int[] digits = {4};
        String input = Arrays.toString(digits);

        assertThat(plusOne.plusOne(digits))
                .as(input)
                .containsExactly(5);
    }

    @Test
    public void test_HasOneCarry() {
        int[] digits = {9};
        String input = Arrays.toString(digits);

        assertThat(plusOne.plusOne(digits))
                .as(input)
                .containsExactly(1, 0);
    }

    @Test
    public void test_HasCarries() {
        int[] digits = {9, 9, 9};
        String input = Arrays.toString(digits);

        assertThat(plusOne.plusOne(digits))
                .as(input)
                .containsExactly(1, 0, 0, 0);
    }

    @Test
    public void test_HasCarriesExceptFist() {
        int[] digits = {8, 9, 9, 9};
        String input = Arrays.toString(digits);

        assertThat(plusOne.plusOne(digits))
                .as(input)
                .containsExactly(9, 0, 0, 0);
    }

}