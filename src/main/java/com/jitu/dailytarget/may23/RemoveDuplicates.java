package com.jitu.dailytarget.may23;

import java.util.LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(2);
        num.add(3);
        num.add(2);
        num.add(2);
        num.add(6);
        num.add(3);
        num.add(6);

        for (int i = 0;i<num.size();i++){
            for (int j = i+1;j<num.size();j++){
                if (num.get(i) == num.get(j)) {
                    num.remove(i);
                }
            }
        }
        for (int i : num){
            System.out.print(i);
        }
    }
}
