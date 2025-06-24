package com.jitu.dailytarget.june24.stringleetcodeeasy;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int a = word1.length();
        int b = word2.length();
        int n = Math.min(a, b);
        for (int i = 0; i < n; i++) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
        }
        if (b < a) {
            merged.append(word1.substring(n, a));
        } else if (a < b) {
            merged.append(word2.substring(n, b));
        }
        return merged.toString();
    }
}
