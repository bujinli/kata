package com.example.test.kata.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

  public int lengthOfLongestSubstring(String s) {

    if (s == null || s.isEmpty()) {
      return 0;
    }
    Map<Character, Integer> map = new HashMap<>();

    int length = 0;
    int tempLength = 0;
    int length2 = 0;

    for (int i = 0; i < s.length(); i++) {
      if (map.containsKey(s.charAt(i))) {
        tempLength = Math.max(tempLength, map.get(s.charAt(i)));
      }
      length = Math.max(length, i - tempLength);
      map.put(s.charAt(i), i);
    }
    return length;
  }
}
