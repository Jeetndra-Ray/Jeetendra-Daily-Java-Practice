package com.jitu.dailytarget.may17.arraylistquestions;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Please Enter 5 Integer");
        int sum = 0;
        for (int i = 0;i<5;i++){
            System.out.println("Please enter" + (i+1)+" Number");
            int num=scanner.nextInt();
            numbers.add(num);
            sum=sum+num;
        }
        float avarage = sum/5;
        System.out.println("Average of the given number is: "+ avarage);
        scanner.close();
    }
}
