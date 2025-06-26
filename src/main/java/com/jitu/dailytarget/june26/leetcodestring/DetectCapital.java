package com.jitu.dailytarget.june26.leetcodestring;
// https://leetcode.com/problems/detect-capital/?envType=problem-list-v2&envId=string
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        }
        if (word.equals(word.toLowerCase())) {
            return true;
        }
        if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }
        return false;
    }
}
