package com.jitu.dailytarget.june27.bitwise;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int uniq=0;
        for (int n :nums){
            uniq^=n;
        }
        return uniq;
    }

    public static void main(String[] args) {
      int []num={4,1,2,1,2};
        System.out.println(singleNumber(num));
    }
}
