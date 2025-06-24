package com.jitu.dailytarget.june23.stirngleetcode;
// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
public class ReverseWordsStringIII {
    public static String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String []strings = s.split(" ");
        for (int i =0;i<strings.length;i++){
            for (int j = strings[i].length()-1;j>=0;j--){
                stringBuilder.append(strings[i].charAt(j));
            }
            if (i < strings.length - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
    public static String reverseWordsUsingInbuild(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String []strings = s.split(" ");
        for (int i =0;i<strings.length;i++){
            if (i < strings.length - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
       String s = "Mr Ding";
        System.out.println(reverseWords(s));
    }
}
