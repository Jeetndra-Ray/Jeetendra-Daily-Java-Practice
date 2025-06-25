package com.jitu.dailytarget.june25.basicrecursion;

public class FirstUppercaseLetterRecursion {
    public static char firstUppercaseLetterUsingRecursion(String string, int a){
        if (string.charAt(a)=='\0'){
            return 0;
        }
        if (Character.isUpperCase(string.charAt(a))){
            return string.charAt(a);
        }
        return firstUppercaseLetterUsingRecursion(string,a+1);
    }

    public static void main(String[] args) {
        String string = "geeksforgeeKs";
        System.out.println(firstUppercaseLetterUsingRecursion(string,0));
    }

}
