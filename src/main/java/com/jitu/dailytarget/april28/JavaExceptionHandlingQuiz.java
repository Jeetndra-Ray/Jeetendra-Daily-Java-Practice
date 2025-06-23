package com.jitu.dailytarget.april28;

public class JavaExceptionHandlingQuiz {
    public static void main(String[] args) {
        int i = 1;

        try {
            i++;
        } catch (Exception e) {
            i++;
        } finally {
            i++;
        }

        System.out.println(i);
    }
}
