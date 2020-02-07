package dev.wonho.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddBinaryTest {

    private final AddBinary addBinary = new AddBinary();

    @Test
    public void test_Example1() {
        String a = "11";
        String b = "1";

        assertThat(addBinary.addBinary(a, b))
                .as("a: " + a + ", b: " + b)
                .isEqualTo("100");
    }

    @Test
    public void test_Example2() {
        String a = "1010";
        String b = "1011";

        assertThat(addBinary.addBinary(a, b))
                .as("a: " + a + ", b: " + b)
                .isEqualTo("10101");
    }

    @Test
    public void test_AllInput_NullOrEmpty() {
        String a = null;
        String b = null;
        assertThat(addBinary.addBinary(a, b)).as("a: null, b: null").isNull();

        a = "";
        b = "";
        assertThat(addBinary.addBinary(a, b)).as("a: \"\", b: \"\"").isNull();
    }

    @Test
    public void test_OneInput_NullOrEmpty() {
        String a = null;
        String b = "1010";
        assertThat(addBinary.addBinary(a, b)).as("a: null, b: " + b).isEqualTo(b);

        a = "";
        assertThat(addBinary.addBinary(a, b)).as("a: null, b: " + b).isEqualTo(b);

        a = "1010";
        b = null;
        assertThat(addBinary.addBinary(a, b)).as("a: " + a + ", b: null").isEqualTo(a);

        b = "";
        assertThat(addBinary.addBinary(a, b)).as("a: " + a + ", b: null").isEqualTo(a);
    }

    @Test
    public void test_NotBinaryDigits() {
        String a = "4634";
        String b = "78952";

        assertThat(addBinary.addBinary(a, b))
                .as("a: " + a + ", b: " + b)
                .isNull();
    }

    @Test
    public void test_HasAllCarries() {
        String a = "1111";
        String b = "1111";

        assertThat(addBinary.addBinary(a, b))
                .as("a: " + a + ", b: " + b)
                .isEqualTo("11110");
    }

}