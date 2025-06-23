package com.jitu.dailytarget.may18.linkedlistquestion;

//Create a LinkedList of numbers and remove all even numbers.

import java.util.LinkedList;

public class RemoveEven {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.addFirst(1);
        num.add(8);

        for (int i=0;i<num.size();i++){
            if (num.get(i)%2!=0){
               num.remove(i);
            }
        }

        for (int i : num){
            System.out.print(i+"-->");
        }
    }
}
