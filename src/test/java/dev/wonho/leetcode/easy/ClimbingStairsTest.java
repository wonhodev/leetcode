package dev.wonho.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbingStairsTest {

    private final ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    public void test_Example1() {
        int n = 2;

        assertThat(climbingStairs.climbStairs(n))
                .as(String.valueOf(n))
                .isEqualTo(2);
    }

    @Test
    public void test_Example2() {
        int n = 3;

        assertThat(climbingStairs.climbStairs(n))
                .as(String.valueOf(n))
                .isEqualTo(3);
    }

    @Test
    public void test_FourToTen() {
        int n = 4;
        assertThat(climbingStairs.climbStairs(n)).as(String.valueOf(n)).isEqualTo(5);

        n = 5;
        assertThat(climbingStairs.climbStairs(n)).as(String.valueOf(n)).isEqualTo(8);

        n = 6;
        assertThat(climbingStairs.climbStairs(n)).as(String.valueOf(n)).isEqualTo(13);

        n = 7;
        assertThat(climbingStairs.climbStairs(n)).as(String.valueOf(n)).isEqualTo(21);

        n = 8;
        assertThat(climbingStairs.climbStairs(n)).as(String.valueOf(n)).isEqualTo(34);

        n = 9;
        assertThat(climbingStairs.climbStairs(n)).as(String.valueOf(n)).isEqualTo(55);

        n = 10;
        assertThat(climbingStairs.climbStairs(n)).as(String.valueOf(n)).isEqualTo(89);
    }

    @Test
    public void test_Negative() {
        int n = -1;

        assertThat(climbingStairs.climbStairs(n))
                .as(String.valueOf(n))
                .isZero();
    }

    @Test
    public void test_ZeroAndOne() {
        int n = 0;
        assertThat(climbingStairs.climbStairs(n)).as(String.valueOf(n)).isZero();

        n = 1;
        assertThat(climbingStairs.climbStairs(n)).as(String.valueOf(n)).isOne();
    }

}