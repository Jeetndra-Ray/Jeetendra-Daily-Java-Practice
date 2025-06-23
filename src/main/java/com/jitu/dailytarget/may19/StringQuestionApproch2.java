package com.jitu.dailytarget.may19;

import java.util.LinkedList;

public class StringQuestionApproch2 {
    public static void main(String[] args) {
        String str = "9H6Z*@A2@cf";
        LinkedList<Character> alpha = new LinkedList<>();
        LinkedList<Character> num = new LinkedList<>();
        LinkedList<Character> sc = new LinkedList<>();

        for (char c : str.toCharArray()) {

            if (Character.isLetter(c)) {
                alpha.add(c);
            } else if (Character.isDigit(c)) {
                num.add(c);
            } else sc.add(c);
        }

        StringBuilder builder = new StringBuilder();
        for (char c : alpha) {
            builder.append(c);
        }
        for (char c : num) {
            builder.append(c);
        }
        for (char c : sc) {
            builder.append(c);
        }

        System.out.println(builder);
    }
}
