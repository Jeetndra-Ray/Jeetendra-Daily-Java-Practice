package com.jitu.dailytarget.april27.basicsandnumber;

public class SmallestDigit {
    public static void main(String[] args) {
        int num = 978;
        int smallest_digit=num%10;
        while (num>0){
            int tem = num%10;
            num=num/10;
            if (smallest_digit>tem){
                smallest_digit=tem;
            }
        }
        System.out.println(smallest_digit);
    }
}
