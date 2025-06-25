package com.jitu.dailytarget.june25.basicrecursion;
// https://leetcode.com/problems/fibonacci-number/submissions/1675789286/?envType=problem-list-v2&envId=recursion
public class FibonacciNumberUsingRecursion {
    public static int fib(int n) {
        if (n<2){return n;}
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println( fib(4));
    }
}
