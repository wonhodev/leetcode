package dev.wonho.leetcode.easy;

/*
https://leetcode.com/problems/length-of-last-word/

58. Length of Last Word
Easy

Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:
    Input: "Hello World"
    Output: 5
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int i = s.length() - 1;
        if (s.charAt(i) == ' ') {
            while (i > 0 && s.charAt(i) == ' ') {
                i--;
            }
        }

        int count = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
            count++;
        }

        return count;
    }

}
