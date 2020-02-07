package dev.wonho.leetcode.easy;

/*
https://leetcode.com/problems/add-binary/

67. Add Binary
Easy

Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:
    Input: a = "11", b = "1"
    Output: "100"

Example 2:
    Input: a = "1010", b = "1011"
    Output: "10101"
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0 || b == null || b.length() == 0) {
            if (a != null && a.length() > 0) {
                return a;
            }

            if (b != null && b.length() > 0) {
                return b;
            }

            return null;
        }

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int binaryA, binaryB, sum;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            if (i < 0) {
                binaryA = 0;
            } else {
                binaryA = a.charAt(i) - '0';
            }

            if (j < 0) {
                binaryB = 0;
            } else {
                binaryB = b.charAt(j) - '0';
            }

            if (binaryA > 1 || binaryB > 1) {
                return null;
            }

            sum = binaryA + binaryB + carry;
            if (sum > 1) {
                if (sum > 2) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
                carry = 1;
            } else {
                sb.append(binaryA + binaryB + carry);
                carry = 0;
            }

            i--;
            j--;
        }

        if (carry > 0) {
            sb.append("1");
        }

        return sb.reverse().toString();
    }

}
