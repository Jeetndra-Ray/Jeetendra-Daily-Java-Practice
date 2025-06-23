package com.jitu.dailytarget.april29.corejavalogical;

// Write a method to check if a given string is a palindrome without using StringBuilder.

public class IsPalindrome {
    public static boolean ispalindrome( String input){
        String reverse="";
        for (int i = input.length()-1;i>=0;i--){
            reverse = reverse+input.charAt(i);
        }
        System.out.println(reverse);
        if (input.equals(input)){
            return true;
        } else
        return false;
    }

    public static void main(String[] args) {
        String a = "adga";
        System.out.println(ispalindrome(a));

    }
}
