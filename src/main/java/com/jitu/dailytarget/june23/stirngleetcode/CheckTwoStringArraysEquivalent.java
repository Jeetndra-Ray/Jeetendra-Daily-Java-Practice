package com.jitu.dailytarget.june23;

public class CheckTwoStringArraysEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            builder.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            builder1.append(word2[i]);
        }
        System.out.println(builder);
        System.out.println(builder1);
        if (builder1.toString().contains(builder.toString()) && builder.toString().contains(builder1.toString())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s[] = {"a", "cb"};
        String s1[] = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(s, s1));
    }
}
