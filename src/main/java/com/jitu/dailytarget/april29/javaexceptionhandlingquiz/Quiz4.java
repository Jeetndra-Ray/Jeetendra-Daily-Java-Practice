package com.jitu.dailytarget.april29.javaexceptionhandlingquiz;

import java.util.Arrays;

public class Quiz4 {
    public static void main(String[] args) {
        try {
            try {
                try {
//                    String s = Arrays.toString(args);
//                    System.out.println(s);
                    String s = args[4];
                }catch (NumberFormatException r){
                    System.out.println("NumberFormatException 1");
                }
            }catch (IndexOutOfBoundsException e){
                System.out.println("IndexOutOfBoundsException: 2");
            }
        }catch (Exception e){
            System.out.println("Exception 3");
        }
    }
}
