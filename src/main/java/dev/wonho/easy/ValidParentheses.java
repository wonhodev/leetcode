package dev.wonho.easy;

import java.util.Stack;

/*
https://leetcode.com/problems/valid-parentheses/

20. Valid Parentheses
Easy

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

Example 1:
    Input: "()"
    Output: true

Example 2:
    Input: "()[]{}"
    Output: true

Example 3:
    Input: "(]"
    Output: false

Example 4:
    Input: "([)]"
    Output: false

Example 5:
    Input: "{[]}"
    Output: true
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }

        if (s.equals("")) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        String validCharacters = "(){}[]";

        for (int i = 0; i < s.length(); i++) {
            if (!validCharacters.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }

            switch (s.charAt(i)) {
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                default:
                    stack.push(s.charAt(i));
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
