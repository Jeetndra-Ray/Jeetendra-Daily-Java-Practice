package com.jitu.dailytarget.june24.stringleetcodeeasy;

// https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                builder.append(s.charAt(i));
            }
        }
        for (int i = builder.length() - 1; i >= 0; i--) {
            builder1.append(builder.charAt(i));
        }
        System.out.println(builder.toString().toLowerCase());
        System.out.println(builder1.toString().toLowerCase());
        if (builder1.toString().toLowerCase().equals(builder.toString().toLowerCase())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
