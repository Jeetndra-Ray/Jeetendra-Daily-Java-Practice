package com.jitu.dailytarget.april29.javaexceptionhandlingquiz;

public class Quiz6 {
    public static void main(String[] args) {
        try {
            main(args);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println(1);
        } catch (Exception | Error e) {
            System.out.println(2);
        }
    }
}
