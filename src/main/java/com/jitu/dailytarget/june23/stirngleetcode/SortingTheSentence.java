package com.jitu.dailytarget.june23.stirngleetcode;

// https://leetcode.com/problems/sorting-the-sentence/description/
public class SortingTheSentence {
    public static String sortSentence(String s) {
        String[] string = s.split(" ");
        String[] string1 = new String[string.length];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length; i++) {
            int a = Integer.parseInt(String.valueOf(string[i].charAt(string[i].length() - 1)));
            string1[a - 1] = string[i].substring(0, string[i].length() - 1);
        }
        for (int i = 0; i < string1.length; i++) {
            builder.append(string1[i]);
            if (i < string1.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
//        String[] string = s.split(" ");
//        int a = Integer.parseInt(String.valueOf(string[1].charAt(string[1].length()-1)));
//        System.out.println(a);
        System.out.println(sortSentence(s));
    }
}
