package com.example.test.kata.leetcode;

public class LongestPalindromicSubstring {

  public String longestPalindrome(String s) {

    boolean[][] dp = new boolean[s.length()][s.length()];
    String ret = "";
    int max = 0;

    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j <= i; j++) {
        dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1]);
        if (dp[i][j]) {
          if (j - i + 1 > max) {
            max = j - i + 1;
            ret = s.substring(i, j);
          }
        }
      }
    }

    return ret;
  }
}

