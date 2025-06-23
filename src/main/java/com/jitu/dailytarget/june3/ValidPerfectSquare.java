package com.jitu.dailytarget.june3;

public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num/2;
        if (num==1){
            return true;
        }
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return true;
            }
            if (mid * mid > num) {
                end = mid - 1;
            }
            if (mid * mid < num) {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }
}
