package com.jitu.dailytarget.june23.stirngleetcode;

public class ToLowerCase {
    public static String toLowerCase(String s) {
        s = s.toLowerCase();
        return s;
    }
    // ASCII of A and a = 65 , 97
    //          B and b  = 66 , 98
    //          C and c = 67,99
    public static void main(String[] args) {
        String s = "here";
        System.out.println(toLowerCase(s));
    }
}
