package com.jitu.dailytarget.april26.exceptionhandling;

public class NullPointerDemo {
    public static void main(String[] args) {
        try {
            String text = null;
            int length = text.length();

            System.out.println(text);
        }
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
