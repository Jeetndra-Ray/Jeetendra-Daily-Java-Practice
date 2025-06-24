package com.jitu.dailytarget.june24.stringleetcodeeasy;

//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
public class FindFirstPalindromicStringArray {
    public String firstPalindrome(String[] words) {
        String string = "";
        for (int i = 0; i < words.length; i++) {
            // words = ["abc","car","ada","racecar","cool"]
            // case1 = "abc"
            int s = 0, e = words[i].length() - 1;
            if (isPalindrome(words[i], s, e)) {
                return words[i];
            }
        }
        return string;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
