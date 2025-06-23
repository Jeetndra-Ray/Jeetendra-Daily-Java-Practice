package com.jitu.dailytarget.april24.loopsandpattern;

// 8)  Print multiplication table of a given number.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Table {

    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);

       try {
           number = scanner.nextInt();
           for (int i = 1; i<=10;i++){
               System.out.println(number + " * " + i + " = " + number*i);
           }

       }catch (InputMismatchException e){
           System.out.println("Please Enter Number Only :)");
       }
       scanner.close();
    }


}
