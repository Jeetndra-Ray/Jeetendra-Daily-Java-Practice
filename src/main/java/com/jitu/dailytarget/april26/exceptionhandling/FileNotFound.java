package com.jitu.dailytarget.april26.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) {


//        try {
//            File file = new File("");
//        } catch ( Exception e) {
//            System.out.println("Error: The file was not found.");
//        }
        try {
            // Trying to open a file that doesn't exist
            File file = new File("abc.txt");
            Scanner scanner = new Scanner(file);

            // Read contents (if file exists)
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handling the exception
            System.out.println("Error: The file was not found.");
            System.out.println("Exception Message: " + e.getMessage());
        }
            }
        }

