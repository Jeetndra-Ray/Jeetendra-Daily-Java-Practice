package com.jitu.dailytarget.may28;

/*Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.*/


public class SqrtOfX {
    public static int sqrtOfX(int x) {

        long start = 1;
        long end = x;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int) mid;
            }
            if (mid * mid < x) {
                start = mid + 1;
            }
            if (mid * mid > x) {
                end = mid - 1;
            }

        }
        if (end < 0) {
            end = end * -1;
        }
        return (int) end;

    }

    public static void main(String[] args) {
        int num = 1;
        // 1,2,3,4,5,6,7,8,9,10,11,12;
        // 25,100
        System.out.println(sqrtOfX(num));
    }

}
