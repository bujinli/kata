package com.example.test.kata.reversevowelsofastring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//a、e、i、o、u
/// https://leetcode-cn.com/problems/reverse-vowels-of-a-string/
public class ReversevowelsofastringTest {

    Reversevowelsofastring rs = new Reversevowelsofastring();

    @Test
    public void test1_reverse_onchar() {
        String result = rs.reverseVowel("a");

        assertEquals(result, "a");
    }

    @Test
    public void test2_reverse_two_char() {
        String result = rs.reverseVowel("ab");

        assertEquals(result, "ab");
    }

    @Test
    public void test3_reverse_hello() {
        String result = rs.reverseVowel("hello");

        assertEquals(result, "holle");
    }

    @Test
    public void test3_reverse_leetcode() {
        String result = rs.reverseVowel("leetcode");

        assertEquals(result, "leotcede");
    }


}