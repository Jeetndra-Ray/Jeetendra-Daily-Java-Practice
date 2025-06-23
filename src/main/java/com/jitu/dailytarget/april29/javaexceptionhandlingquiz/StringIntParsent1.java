package com.jitu.dailytarget.april29.javaexceptionhandlingquiz;

public class StringIntParsent1 {
    public static void main(String[] args) {
        String scr = "abcd";
        String scr1 = "ab12";
        String scr2 = "123456";
       int a = scr2.length();
        int b =Integer.parseInt(scr2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
    }
}
