package com.jitu.dailytarget.june2;

public class NumberOfCommonFactors {
    public int commonFactors(int a, int b) {
        int count = 0;
        int less;
        if (a < b) {
            less = a;
        } else less = b;

        for (int i = 0; i <= less; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }

}
