package com.jitu.dailytarget.june26.leetcodestring;

import com.sun.jdi.IntegerValue;

import java.math.BigInteger;

// https://leetcode.com/problems/add-strings/description/?envType=problem-list-v2&envId=string
public class AddStrings {
    public static String addStrings(String num1, String num2) {
        BigInteger bigInteger =new BigInteger(String.valueOf(Integer.parseInt(num1)+Integer.parseInt(num2)));
        System.out.println(bigInteger);
        return String.valueOf(bigInteger);

    }
    public static void main(String[] args) {
        System.out.println(addStrings("6913259244","71103343"));
    }
}
