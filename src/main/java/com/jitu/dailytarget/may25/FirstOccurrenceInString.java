package com.jitu.dailytarget.may25;

public class FirstOccurrenceInString {
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                String subString = haystack.substring(i, needle.length() + i);
                if (subString.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static int strStr2(String haystack, String needle) {
        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i,needle.length()+i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr2(haystack, needle));
    }
}
