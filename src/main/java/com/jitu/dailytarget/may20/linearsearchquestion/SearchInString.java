package com.jitu.dailytarget.may20.linearsearchquestion;

public class SearchInString {
    public static int searchString(String s, char target) {
        if (s.length() == 0) {
            return -1;
        }
        for (char c : s.toCharArray()) {
            if (c == target) {
                return s.indexOf(c);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "Jitu";
        System.out.println(searchString("Jitu",'q'));
    }

}
