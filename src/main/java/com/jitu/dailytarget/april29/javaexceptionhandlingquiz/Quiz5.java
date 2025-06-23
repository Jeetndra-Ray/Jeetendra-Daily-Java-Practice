package com.jitu.dailytarget.april29.javaexceptionhandlingquiz;

// 13) Does the following code compile without errors?

public class Quiz5 {
    public static void main(String[] args) {
        try {
            System.out.println("this is a finally block");
        }
        finally {
            System.out.println("this is a finally block");
        }
    }
}
