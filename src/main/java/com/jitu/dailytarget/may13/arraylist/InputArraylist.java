package com.jitu.dailytarget.may13.arraylist;

// Take input of 5 fruits from the user and store in ArrayList Search if "Mango" is present or not

import java.util.ArrayList;
import java.util.Scanner;

public class InputArraylist {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the names of 5 fruits:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter fruit " + (i + 1) + ": ");
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }
        if (fruits.contains("Mango")) {
            System.out.println("Mango is present in the list.");
        } else {
            System.out.println("Mango is not present in the list.");
        }
        scanner.close();
    }

}
