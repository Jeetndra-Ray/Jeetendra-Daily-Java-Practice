package com.jitu.dailytarget.april27.basicsandnumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num= 121;
        int num2= num;
        int result=0;

        while (num2>0){
            int temp= num2%10;
            num2=num2/10;
            result=result*10+temp;
        }
        if (num==result){
            System.out.println(num+" Is A Palindrome Number");
        }
        else System.out.println(num+" Is Not A Palindrome Number");
    }
}
