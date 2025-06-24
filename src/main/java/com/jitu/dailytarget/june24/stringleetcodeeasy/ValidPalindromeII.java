package com.jitu.dailytarget.june24.stringleetcodeeasy;
//https://leetcode.com/problems/valid-palindrome-ii/description/
public class ValidPalindromeII {
    public static boolean validPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =s.length()-1;i>=0;i--){
            stringBuilder.append(s.charAt(i));
        }
        if (stringBuilder.toString().equals(s)){
            return true;
        }
        else return false;
    }
    public static boolean validPalindromeCorrectLogic(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Try removing one character from either end
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }
}
