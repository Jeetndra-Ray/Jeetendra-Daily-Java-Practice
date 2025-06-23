package com.jitu.dailytarget.may28;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int input=x;
        int result=0;
    while (x>0){
        int tem=x%10;
        result=result*10+tem;
        x=x/10;
    }
    if (result==input){
        return true;}
    else return false;
    }
}
