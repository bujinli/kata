package com.example.test.kata.reversestring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ReverseStringTest {


    ReverseString rs = new ReverseString();

    @Test
    public void test1_with_one_char() {
        char[] input = new char[]{'a'};
        rs.reverseString(input);

        assertEquals(input[0], 'a');
    }

    @Test
    public void test2_with_two_char() {
        char[] input = new char[]{'a', 'b'};
        rs.reverseString(input);

        assertEquals(input[0], 'b');
        assertEquals(input[1], 'a');
    }

    @Test
    public void test3_with_three_char() {
        char[] input = new char[]{'a', 'b', 'c'};
        rs.reverseString(input);

        assertEquals(input[0], 'c');
        assertEquals(input[1], 'b');
        assertEquals(input[2], 'a');
    }

}