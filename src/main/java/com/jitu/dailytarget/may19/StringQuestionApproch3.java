package com.jitu.dailytarget.may19;

public class StringQuestionApproch3 {
    public static void main(String[] args) {
        String str = "9H6Z*@A2@cf";
        String result="";
            for (char c : str.toCharArray()) {
                if (Character.isLetter(c)) {
                   result=result+c;
                }
            }
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                result=result+c;
            }
        }

        for (char c : str.toCharArray()) {
            if (! (Character.isLetter(c)|| Character.isDigit(c))){
                result=result+c;
            }
        }

        System.out.println(result);
    }
}

