package com.jitu.dailytarget.april26.exceptionhandling;

// Access an invalid array index and catch the ArrayIndexOutOfBoundsException

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        int array[] = {34, 55, 6, 77, 75, 66};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please Enter Index Of A Array From 0 to 5");
            int index = scanner.nextInt();
            System.out.println(array[index]);
            System.out.println("****************************************************");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter Index From 0 to 5 Only");
        } catch (InputMismatchException e) {
            System.out.println("Please Enter Integer Value only :)");
        }
        System.out.println("****************************************************");
         scanner.close();
    }

}
