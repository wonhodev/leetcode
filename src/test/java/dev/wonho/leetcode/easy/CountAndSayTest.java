package dev.wonho.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountAndSayTest {

    private final CountAndSay countAndSay = new CountAndSay();

    @Test
    public void test_Examples() {
        int n = 1;
        String output = "1";
        assertThat(countAndSay.countAndSay(n)).as("n: " + n).isEqualTo(output);

        n = 2;
        output = "11";
        assertThat(countAndSay.countAndSay(n)).as("n: " + n).isEqualTo(output);

        n = 3;
        output = "21";
        assertThat(countAndSay.countAndSay(n)).as("n: " + n).isEqualTo(output);

        n = 4;
        output = "1211";
        assertThat(countAndSay.countAndSay(n)).as("n: " + n).isEqualTo(output);

        n = 5;
        output = "111221";
        assertThat(countAndSay.countAndSay(n)).as("n: " + n).isEqualTo(output);
    }

    @Test
    public void test_InvalidRange() {
        int n = 0;
        assertThat(countAndSay.countAndSay(n)).as("n: " + n).isNull();

        n = 31;
        assertThat(countAndSay.countAndSay(n)).as("n: " + n).isNull();
    }

}