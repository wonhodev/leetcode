package dev.wonho.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesesTest {

    private ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void test_Examples_True() {
        String input = "()";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isTrue();

        input = "()[]{}";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isTrue();

        input = "{[]}";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isTrue();
    }

    @Test
    public void test_Examples_False() {
        String input = "(]";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();

        input = "([)]])";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();
    }

    @Test
    public void test_Null() {
        String input = null;
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();
    }

    @Test
    public void test_Empty() {
        String input = "";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isTrue();
    }

    @Test
    public void test_WrongCharacter() {
        String input = "()_[]";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();

        input = "=[]";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();

        input = "[]+";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();
    }

    @Test
    public void test_NotClosed() {
        String input = "(";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();

        input = "[({)]";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();

        input = "({}[]";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();
    }

    @Test
    public void test_OnlyClose() {
        String input = ")";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();

        input = "}";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();

        input = "]";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();
    }

    @Test
    public void test_IncorrectOrder() {
        String input = "(";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();

        input = "[({)]";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();

        input = "({}[]";
        assertThat(validParentheses.isValid(input)).as("Input: " + input).isFalse();
    }

}