package com.jitu.dailytarget.may19;

import java.util.ArrayList;
import java.util.Collections;

public class StringQuestion {
    public static void main(String[] args) {
        String str = "9H6Z*@A2@cf";
        String result="";
        ArrayList<Character> characters = new ArrayList<>();
        for (int i =0;i<str.length();i++){
            characters.add(str.charAt(i));
        }
        Collections.sort(characters);

        for (Character c:characters){
            System.out.print(c);
        }
}
}
