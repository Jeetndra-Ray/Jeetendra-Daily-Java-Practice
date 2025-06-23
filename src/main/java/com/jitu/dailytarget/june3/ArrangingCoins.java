package com.jitu.dailytarget.june3;

public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        int count = 0;
        for (int i = 1; i <=n; i++) {
            int temp = n-i;
            if (temp>0){
                count++;
                n = temp;
            }else break;
        }
        return count;
    }
    public static int arrangeCoinsUsingWhileLoop(int n) {
       int count = 1;
       while (count<=n){
           int mid = (count+n)/2;


       }
       return 1;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }


    ///  input = 5, start = 1, end =
}
