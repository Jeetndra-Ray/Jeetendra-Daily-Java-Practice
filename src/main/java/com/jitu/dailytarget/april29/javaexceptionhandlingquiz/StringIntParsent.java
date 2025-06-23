package com.jitu.dailytarget.april29.javaexceptionhandlingquiz;

public class StringIntParsent {

    public static void main(String[] args) {

        String scr = "abcd";
        String scr1 = "ab12";
        String scr2 = "1234";
        try {
            System.out.println(Integer.parseInt(scr));
        }catch (NumberFormatException e){
            System.out.println(scr + " will not work for Integer.parseInt method");
        }
        try {
            System.out.println(Integer.parseInt(scr1));
        }catch (NumberFormatException e){
            System.out.println(scr1 + " will not work for Integer.parseInt method");
        } try {
            System.out.println(Integer.parseInt(scr2));
        }catch (NumberFormatException e){
            System.out.println(scr2 + "will not work for Integer.parseInt method");
        }

    }
}
