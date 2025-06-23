package com.jitu.dailytarget.april24.basiccondition;

import java.util.InputMismatchException;
import java.util.Scanner;

// 4) Print all even numbers between 1 and n.
public class EvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("All even numbers between 1 and "+ number + " Is:");

        try {

            int i;
            for ( i= 1; i<= number; i++){
                if (i%2==0){System.out.print(i+",");}}
        }
        catch (InputMismatchException e){
            System.out.println("Please Enter Number Only :)");
        }

        scanner.close();

    }

}
