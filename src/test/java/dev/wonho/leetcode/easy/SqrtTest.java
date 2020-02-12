package dev.wonho.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SqrtTest {

    private final Sqrt sqrt = new Sqrt();

    @Test
    public void test_Example1() {
        int x = 4;

        assertThat(sqrt.mySqrt(x))
                .as(String.valueOf(x))
                .isEqualTo(2);
    }

    @Test
    public void test_Example2() {
        int x = 8;

        assertThat(sqrt.mySqrt(x))
                .as(String.valueOf(x))
                .isEqualTo(2);
    }

    @Test
    public void test_Negative() {
        int x = -4;

        assertThat(sqrt.mySqrt(x))
                .as(String.valueOf(x))
                .isZero();
    }

    @Test
    public void test_Zero() {
        int x = 0;

        assertThat(sqrt.mySqrt(x))
                .as(String.valueOf(x))
                .isZero();
    }

    @Test
    public void test_One() {
        int x = 1;

        assertThat(sqrt.mySqrt(x))
                .as(String.valueOf(x))
                .isOne();
    }

    @Test
    public void test_LessThan10ExceptExamples() {
        int x = 2;
        assertThat(sqrt.mySqrt(x)).as(String.valueOf(x)).isOne();

        x = 3;
        assertThat(sqrt.mySqrt(x)).as(String.valueOf(x)).isOne();

        x = 5;
        assertThat(sqrt.mySqrt(x)).as(String.valueOf(x)).isEqualTo(2);

        x = 6;
        assertThat(sqrt.mySqrt(x)).as(String.valueOf(x)).isEqualTo(2);

        x = 7;
        assertThat(sqrt.mySqrt(x)).as(String.valueOf(x)).isEqualTo(2);

        x = 9;
        assertThat(sqrt.mySqrt(x)).as(String.valueOf(x)).isEqualTo(3);
    }

    @Test
    public void test_MAX_VALUE() {
        int x = Integer.MAX_VALUE;

        assertThat(sqrt.mySqrt(x))
                .as(String.valueOf(x))
                .isEqualTo((int)Math.sqrt(x));
    }

    @Test
    public void test_Big() {
        int x = 914748364;
        assertThat(sqrt.mySqrt(x)).as(String.valueOf(x)).isEqualTo((int)Math.sqrt(x));

        x = 447483647;
        assertThat(sqrt.mySqrt(x)).as(String.valueOf(x)).isEqualTo((int)Math.sqrt(x));
    }

}