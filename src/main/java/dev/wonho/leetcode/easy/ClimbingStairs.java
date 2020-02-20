package dev.wonho.leetcode.easy;

/*
70. Climbing Stairs
Easy

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:
    Input: 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps

Example 2:
    Input: 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n < 0) {
            return 0;
        }

        if (n < 4) {
            return n;
        }

        int fib1 = 2;
        int fib2 = 3;
        int ways = 0;
        for (int i = 4; i <= n; i++) {
            ways = fib1 + fib2;
            fib1 = fib2;
            fib2 = ways;
        }

        return ways;
    }

}
