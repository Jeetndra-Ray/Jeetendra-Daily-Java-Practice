package com.jitu.dailytarget.april27.basicsandnumber;
// Find the largest digit in a number.
public class LargestDigit {
    public static void main(String[] args) {
        int num =789;
        int largestnumber= 0;
        while (num>0){
            int temp = num%10;
            num = num/10;
            if (largestnumber<temp){
                largestnumber=temp;
            }
        }
        System.out.println(largestnumber);
    }
}
