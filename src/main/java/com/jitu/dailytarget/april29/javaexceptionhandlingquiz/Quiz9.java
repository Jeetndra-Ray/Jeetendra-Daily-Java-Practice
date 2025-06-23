package com.jitu.dailytarget.april29.javaexceptionhandlingquiz;

public class Quiz9 {
    static String anyMethod() {
        String s = "ONE";
        try {
            s = s + "TWO";

            return s;
        } catch (Exception e) {
            s = s + "THREE";

            return s;
        } finally {
            s = s + "FOUR";
        }
    }

    public static void main(String[] args) {
        System.out.println(anyMethod());
    }
}
