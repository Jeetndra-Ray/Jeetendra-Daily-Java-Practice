package com.jitu.dailytarget.may25;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s){
        for (int i = 0; i < s.length(); ++i) {
            boolean found = false;
            for (int j = 0; j < s.length(); ++j) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return(i);
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "abcafbcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
