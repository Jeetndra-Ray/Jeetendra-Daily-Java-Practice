package com.jitu.dailytarget.april27.basicsandnumber;

public class GPSeries2 {

        public static void main(String[] args) {
            int firstTerm = 3;  // First term (a1)
            int commonRatio = 2;  // Common ratio (r)
            int numberOfTerms = 10;  // Number of terms (n)

            System.out.println("Geometric Progression (GP) series:");

            // Display the terms of the GP
            for (int n = 1; n <= numberOfTerms; n++) {
                int nthTerm = (int) (firstTerm * Math.pow(commonRatio, n - 1));
                System.out.print(nthTerm + " ");
            }
        }

}
