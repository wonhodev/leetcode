package dev.wonho.leetcode.easy;

/*
https://leetcode.com/problems/sqrtx/

69. Sqrt(x)
Easy

Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer,
the decimal digits are truncated and only the integer part of the result is returned.

Example 1:
    Input: 4
    Output: 2

Example 2:
    Input: 8
    Output: 2
    Explanation: The square root of 8 is 2.82842..., and since
                 the decimal part is truncated, 2 is returned.
 */
public class Sqrt {

    public int mySqrt(int x) {
        if (x < 1) {
            return 0;
        }

        if (x < 4) {
            return 1;
        }

        int low = 0;
        int high = x / 2;
        int mid;
        int multi;

        while (low <= high) {
            mid = (low + high) / 2;
            multi = mid * mid;

            if (multi == x) {
                return mid;
            } else if (mid > Integer.MAX_VALUE / mid ||  multi > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low - 1;
    }

}
