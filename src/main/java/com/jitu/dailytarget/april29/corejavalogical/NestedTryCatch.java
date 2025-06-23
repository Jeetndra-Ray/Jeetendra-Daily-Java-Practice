package com.jitu.dailytarget.april29.corejavalogical;

// Write a program to demonstrate nested try-catch blocks.

public class NestedTryCatch {
    public static void main(String[] args) {
        int a[]= {34,56,67,7};
        try {
          int b = a[3];
            System.out.println(b);
          try {
           int c = 10/0;
          }catch (ArithmeticException r){
              System.out.println("divide by 0 is not applicable");
          }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
