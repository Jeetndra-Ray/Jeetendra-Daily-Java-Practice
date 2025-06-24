package com.jitu.dailytarget.june17;

//https://leetcode.com/problems/find-the-difference/description/?envType=problem-list-v2&envId=sorting

public class FindtheDifference {
    public static char findTheDifference(String s, String t) {

        int i =0;
        for (;i<s.length();i++){
           if (s.charAt(i)!=t.charAt(i)){
              return t.charAt(i);
           }
        }
        return t.charAt(i);
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
}
