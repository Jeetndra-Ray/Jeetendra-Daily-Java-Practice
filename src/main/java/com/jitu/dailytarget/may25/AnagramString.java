package com.jitu.dailytarget.may25;

import java.util.Arrays;

public class AnagramString {
    public static void anagramString(String a, String b){
        char carArr[] =a.toCharArray();
        char carArr1[]=b.toCharArray();
        Arrays.sort(carArr1);
        Arrays.sort(carArr);
        if (Arrays.equals(carArr1, carArr)){
            System.out.println(a + " and " + b +" are Anagram String");
        }
        else System.out.println(a + " and " + b +" are not Anagram String");

    }

    public static void main(String[] args) {
        String s="keep";
        String s1="peek";
        String s2= "Peek";
        anagramString(s,s1);
        anagramString(s,s2);
    }
}
