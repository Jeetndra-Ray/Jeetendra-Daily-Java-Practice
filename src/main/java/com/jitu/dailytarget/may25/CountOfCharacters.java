package com.jitu.dailytarget.may25;

public class CountOfCharacters {
    public static void main(String[] args) {
        String string ="Jitu Rai";
        String string1 = "Java is Good But C/C++ is fast then Java";
        System.out.println(countOfCharacters(string));
        System.out.println(countOfCharacters(string1));
    }
    public static int countOfCharacters(String s){
        return s.replaceAll(" ","").length();
    }
}
