package com.jitu.dailytarget.may13.arraylist;

// Take 5 integers from the user and store them in an ArrayList.
//Only store unique values. If a number is already present, skip it.

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueNumbersList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 Number:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (!numbers.contains(num))
                numbers.add(num);
        }
        for (int i : numbers) {
            System.out.println(i);
        }
        System.out.println("Size of the ArrayList is : " + numbers.size());
        scanner.close();
    }
}
