package com.jitu.dailytarget.april25.basicandmath;

// 23) Check if a given N digit number is an Armstrong number.


import java.util.Scanner;

public class ArmstrongNumber2 {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter Digit of number Example: Number = 3453: Then Input Will We 4");
            int digit = scanner.nextInt();
            System.out.println("Please Enter Number Example: 1234 ");
            int input = scanner.nextInt();
            int count = 0;
            int input2 = input;
            while (input2 > 0) {
                int temp = input2 % 10;
                count++;
                input2 = input2 / 10;
            }
            System.out.println(count);
            if (count == digit) {
                int result = 0;
                int temp_number = input; // we will use temp variable number so that real input will not override by 0;
                while (temp_number > 0) {
                    int tem = temp_number % 10;
                    result += Math.pow(tem, digit);
                    temp_number = temp_number / 10;
                }
                if (result == input) {
                    System.out.println(input + " is an Armstrong number.");
                } else System.out.println(input + " is not an Armstrong number.");

            } else {
                System.out.println("Your Number of Digit and Number Is Not Matching");
            }
            scanner.close();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Both Number of Digit and Number Should Be Integer :)");
        }
    }
}
