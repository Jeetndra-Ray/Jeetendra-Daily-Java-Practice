package com.jitu.dailytarget.april29.javaexceptionhandlingquiz;

public class Quiz8 {
    static int anyMethod() {
        try {
            return 10;
        } catch (Exception e) {
            return 20;
        } finally {
            return 30;
        }
    }

    public static void main(String[] args) {
        System.out.println(anyMethod());
    }
}
