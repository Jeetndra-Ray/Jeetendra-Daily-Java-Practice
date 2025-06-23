package com.jitu.dailytarget.may17.arraylistquestions;

import java.util.ArrayList;

public class SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(04);
        num.add(14);
        num.add(34);
        num.add(24);
        num.add(44);

        int fistLargest=num.get(0);
        int secondLargest=num.get(0);
        for (int i = 0; i<num.size();i++){
            if (num.get(i)>fistLargest){
                fistLargest=num.get(i);
            }
        }
        for (int i = 0; i<num.size();i++){
            if (num.get(i)>secondLargest&& num.get(i)<fistLargest){
                secondLargest=num.get(i);
            }
        }
        System.out.println("The Second Largest Element in the ArrayList is : "+secondLargest);
    }
}
