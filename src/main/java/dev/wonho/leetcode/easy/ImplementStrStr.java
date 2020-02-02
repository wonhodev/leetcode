package dev.wonho.leetcode.easy;

/*
https://leetcode.com/problems/implement-strstr/

28. Implement strStr()
Easy

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
    Input: haystack = "hello", needle = "ll"
    Output: 2

Example 2:
    Input: haystack = "aaaaa", needle = "bba"
    Output: -1

Clarification:
    What should we return when needle is an empty string? This is a great question to ask during an interview.
    For the purpose of this problem, we will return 0 when needle is an empty string.
    This is consistent to C's strstr() and Java's indexOf().
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() < needle.length()) {
            return -1;
        }

        if (needle.isEmpty()) {
            return 0;
        }

        int i = 0;
        int j;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                j = 0;
                while (j < needle.length()) {
                    if (haystack.length() < i + j + 1) {
                        return -1;
                    }

                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }

                    j++;
                }

                if (j == needle.length()) {
                    return i;
                }
            }

            i++;
        }

        return -1;
    }

}
