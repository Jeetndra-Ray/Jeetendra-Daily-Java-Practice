package com.jitu.dailytarget.april27.customeexceptionh.ageexception;

import com.jitu.dailytarget.april27.customeexceptionh.ageexception.AgeException;

import java.util.Scanner;

public class AgeExceptionDemo {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        int age = scanner.nextInt();
        try {
            if (age < 18) {
                throw new AgeException("Age is less than 18. Not eligible!");
            } else {
                System.out.println("Age is valid. You are eligible.");
            }
        } catch (AgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        scanner.close();
        System.out.println("Scanner is close");
    }
}
