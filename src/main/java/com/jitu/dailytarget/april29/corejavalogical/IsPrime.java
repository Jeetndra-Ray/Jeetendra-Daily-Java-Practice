package com.jitu.dailytarget.april29.corejavalogical;

public class IsPrime {

    public static boolean isprime( int num){

        for (int i = 2;i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    };

    public static void main(String[] args) {
        int a =9;
        boolean b= isprime(a);
        System.out.println(b);
        System.out.println(isprime(a));

    }
}
