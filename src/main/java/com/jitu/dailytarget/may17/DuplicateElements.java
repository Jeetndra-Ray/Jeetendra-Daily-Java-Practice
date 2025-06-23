package com.jitu.dailytarget.may17;

public class DuplicateElements {
    public static void main(String[] args) {
        int array[] = {2, 3, 4, 3, 2};
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            // Check if element has already been printed
            for (int k = 0; k < i; k++) {
                if (array[i] == array[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                continue; // Skip already printed duplicates
            }

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
