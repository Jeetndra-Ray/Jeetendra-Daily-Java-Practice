package com.jitu.dailytarget.may20.linearsearchquestion;

public class EvenDigitsApproachThreeUsingLog {



    public static int approachThreeUsingLog(int arr[]) {
        int count = 0;
        for (int i : arr) {
            if (isEven2(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean isEven2(int num) {
        int numbesdigit = digit(num);
        return numbesdigit % 2 == 0;
    }

    static int digit(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }
}
