package com.jitu.dailytarget.may25;

public class ReverseWords {
    public static String reverseWords(String s) {
        StringBuilder result= new StringBuilder();
        String s1[]=s.split(" +");
        for (int i=s1.length-1;i>=0;i--){
            result.append(s1[i]);
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
