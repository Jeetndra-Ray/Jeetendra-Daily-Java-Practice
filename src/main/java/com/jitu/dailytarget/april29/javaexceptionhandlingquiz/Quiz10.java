package com.jitu.dailytarget.april29.javaexceptionhandlingquiz;

public class Quiz10 {
    static void anyMethod() {
        try {
            System.out.println("Try Block");
        } catch (Exception e) {
            System.out.println("Catch Block");
        } finally {
            return ;
          //  System.out.println("Return");
        }

       // System.out.println("Any Statements");
    }

    public static void main(String[] args) {
        anyMethod();
    }
}
