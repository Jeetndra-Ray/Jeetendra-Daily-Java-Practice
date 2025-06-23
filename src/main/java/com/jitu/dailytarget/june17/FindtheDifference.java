package com.jitu.dailytarget.june17;

//https://leetcode.com/problems/find-the-difference/description/?envType=problem-list-v2&envId=sorting

public class FindtheDifference {
    public char findTheDifference(String s, String t) {
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        char c = 0;

        for (int i = 0;i<s2.length;i++){
           if (s1[i]!=s2[i]){
              return(char)s2[i];
           }
           break;
        }
        return c;
    }
}
