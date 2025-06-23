package com.jitu.dailytarget.april25.basicandmath;
// 20) Check if a year is a leap year or not.
import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int year= scanner.nextInt();
            if ((year%4==0 && year%100!=0) || (year % 400 == 0)){
                System.out.println(year+" Is A Leap Year");
            }
            else System.out.println(year+ " Is Not A Leap Year");

        } catch (InputMismatchException e){
            System.out.println("Please Enter Year Only, Example 2010,2034,2025,ect. :)");
        }
        scanner.close();
    }
}
