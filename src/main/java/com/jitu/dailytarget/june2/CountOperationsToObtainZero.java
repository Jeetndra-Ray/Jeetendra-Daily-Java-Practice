package com.jitu.dailytarget.june2;

public class CountOperationsToObtainZero {
    public static int countOperations(int num1, int num2) {
        if (num1 ==0 || num2 ==0){
            return 1;
        }
        int count=0;
        while (num1>0){
            if (num1 >= num2){
                num1 = num1-num2;
            }
            else num2=num2-num1;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num1=1; int num2=0;
        System.out.println(countOperations(num1,num2));


    }
}
