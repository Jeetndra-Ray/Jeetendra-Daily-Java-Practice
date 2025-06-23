package com.jitu.dailytarget.april25.basicandmath;
// 21) Calculate the power of a number (x^n) without using Math.pow().
import java.util.InputMismatchException;
import java.util.Scanner;

public class PoweOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please Enter Number");
            int num = scanner.nextInt();
            System.out.println("Please Enter Power");
            int power = scanner.nextInt();
            scanner.close();
            int power_of_number=1;

            for (int i = 1;i<=power;i++){
                power_of_number =  power_of_number * num;
            }
            System.out.println(power_of_number);
        } catch (InputMismatchException e){
            System.out.println("Both Number and Power Should Be Integrate :)");
        }
    }
}
