package com.jitu.dailytarget.april27.basicsandnumber;

public class APSeries2 {

        public static void main(String[] args) {
            int firstTerm = 2;  // First term (a1)
            int commonDifference = 3;  // Common difference (d)
            int numberOfTerms = 10;  // Number of terms (n)

            System.out.println("Arithmetic Progression (AP) series:");

            // Display the terms of the AP
            for (int n = 1; n <= numberOfTerms; n++) {
                int nthTerm = firstTerm + (n - 1) * commonDifference;
                System.out.print(nthTerm + " ");
            }
        }

}
