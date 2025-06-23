package com.jitu.dailytarget.may12.userdatatofile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataToFile {

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read user data
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your mobile number: ");
        String mobile = scanner.nextLine();


        // Store user data in a text file
        try (FileWriter writer = new FileWriter("user_data.txt", true)) {
            // Write user data to the file
            writer.write("Name: " + name + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Mobile: " + mobile + "\n");
            writer.write("----------------------------\n");

            System.out.println("Data has been saved successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Close the scanner
        scanner.close();
    }
}

