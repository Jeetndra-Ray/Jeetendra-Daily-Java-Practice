package com.jitu.dailytarget.june24.stringleetcodeeasy;
// https://leetcode.com/problems/fibonacci-number/description/
public class FibonacciNumber {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int tem = 0;
        for (int i = 2; i <= n; i++) {
            tem = a + b;
            a = b;
            b = tem;
        }
        return tem;
    }
}
