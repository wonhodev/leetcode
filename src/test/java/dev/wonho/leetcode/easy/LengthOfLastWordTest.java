package dev.wonho.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LengthOfLastWordTest {

    private final LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    public void test_Example() {
        String input = "Hello World";
        assertThat(lengthOfLastWord.lengthOfLastWord(input)).as(input).isEqualTo(5);
    }

    @Test
    public void test_NullOrEmpty() {
        String input = null;
        assertThat(lengthOfLastWord.lengthOfLastWord(input)).as("null").isZero();

        input = "";
        assertThat(lengthOfLastWord.lengthOfLastWord(input)).as("\"\"").isZero();
    }

    @Test
    public void test_OnlySpaces() {
        String input = "               ";
        assertThat(lengthOfLastWord.lengthOfLastWord(input)).as(input).isZero();
    }

    @Test
    public void test_OneCharacter() {
        String input = "a";
        assertThat(lengthOfLastWord.lengthOfLastWord(input)).as(input).isOne();
    }

    @Test
    public void test_OneWord() {
        String input = "abc";
        assertThat(lengthOfLastWord.lengthOfLastWord(input)).as(input).isEqualTo(3);
    }

    @Test
    public void test_FirstOrLastCharacterSpace() {
        String input = " abc";
        assertThat(lengthOfLastWord.lengthOfLastWord(input)).as(input).isEqualTo(3);

        input = "abc ";
        assertThat(lengthOfLastWord.lengthOfLastWord(input)).as(input).isEqualTo(3);
    }

}