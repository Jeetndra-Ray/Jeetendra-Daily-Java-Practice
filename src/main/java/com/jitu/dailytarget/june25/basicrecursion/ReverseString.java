package com.jitu.dailytarget.june25.basicrecursion;
// https://leetcode.com/problems/reverse-string/description
public class ReverseString {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] c = {'h', 'e', 'l','l', 'o'};
        reverseString(c);
    }
}
