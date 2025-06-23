package com.jitu.dailytarget.may25;

public class ShortestPalindrome {
    public String shortestPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String s1="";
        for (int i=s.length()-1;i>=1;i--){
            s1=s1+s.charAt(i);
        }
        stringBuilder.append(s1);
        stringBuilder.append(s);
         return stringBuilder.toString();
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String s = "abcd";
        String s1="";
        for (int i=s.length()-1;i>=1;i--){
            s1=s1+s.charAt(i);
        }
        stringBuilder.append(s1);
        stringBuilder.append(s);
        System.out.println(stringBuilder.toString());
//        String result = stringBuilder.toString();
//        System.out.println(result);
    }
}
