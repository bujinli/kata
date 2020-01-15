package com.example.test.kata.reversestring;


//reversevowelsofastring
public class ReverseString {

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            swap(s, i, s.length-1-i);
        }
    }

    private void swap(char[] s, int source, int target) {
        s[source] = (char) (s[source] + s[target]);
        s[target] = (char) (s[source] - s[target]);
        s[source] = (char) (s[source] - s[target]);
    }
}
