package com.example.test.kata.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestSubstringTest {

  @Test
  public void lengthOfLongestSubstring() {
    LongestSubstring a = new LongestSubstring();
    int ret =a.lengthOfLongestSubstring("dv0dfabce");
    System.out.println(ret);
  }
}