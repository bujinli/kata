package com.example.test.kata.reversevowelsofastring;

public class Reversevowelsofastring {

    char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'};

    public String reverseVowel(String s) {
        char[] chars = s.toCharArray();

        int begin = 0;
        int end = s.length() - 1;

        while (begin < end) {
            if (!isVowel(chars[begin])) {
                begin++;
            }
            if (!isVowel(chars[end])) {
                end--;
            }
            if (isVowel(chars[begin]) && isVowel(chars[end])) {
                char temp = chars[begin];
                chars[begin] = chars[end];
                chars[end] = temp;
                begin++;
                end--;
            }
        }
        return String.valueOf(chars);
    }


    private boolean isVowel(char c) {
        for (char v : vowels) {
            if (v == c) {
                return true;
            }
        }
        return false;
    }

}
