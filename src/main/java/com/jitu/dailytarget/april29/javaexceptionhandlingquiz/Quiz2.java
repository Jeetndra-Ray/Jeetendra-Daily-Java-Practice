package com.jitu.dailytarget.april29.javaexceptionhandlingquiz;

public class Quiz2 {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            try {

                String s = null;

                int a = s.length();

            } catch (Exception e) {
                System.out.println(1);
            }
        }
        //catch ( NullPointerException f)// Compile Time Error : Unreachable catch block for NullPointerException. It is already handled by the catch block for Exception.

        {
            System.out.println(2);
        }
    }
}
