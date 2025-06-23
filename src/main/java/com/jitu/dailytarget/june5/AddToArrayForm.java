package com.jitu.dailytarget.june5;

//https://leetcode.com/problems/add-to-array-form-of-integer/

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
         String sum="";
        for (int i = 0;i<num.length;i++){
            sum = sum+num[i];
        }
        BigInteger bigInteger = new BigInteger(sum);
        BigInteger add = bigInteger.add(BigInteger.valueOf(k));
        String src = String.valueOf(add);
        System.out.println(src);

        for (int i = 0; i < src.length(); i++) {
            list.add(src.charAt(i) - '0'); // Convert char digit to int
        }
        return list;
    }

    public static void main(String[] args) {
       int []num ={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
//        System.out.println(addToArrayForm(num,34));
        List<Integer> list = addToArrayForm(num,516);
        for (int i : list){
            System.out.println(i);
        }

    }
}
