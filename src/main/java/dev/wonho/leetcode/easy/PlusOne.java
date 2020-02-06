package dev.wonho.leetcode.easy;

/*
https://leetcode.com/problems/plus-one/

66. Plus One
Easy

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list,
and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
    Input: [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.

Example 2:
    Input: [4,3,2,1]
    Output: [4,3,2,2]
    Explanation: The array represents the integer 4321.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return null;
        }

        int carry = 0;
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + carry > 9) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] += carry;
                return digits;
            }
        }

        int[] output = new int[digits.length + 1];
        output[0] = 1;
        for (int j = 0; j < digits.length; j++) {
            output[j + 1] = digits[j];
        }

        return output;
    }

}
