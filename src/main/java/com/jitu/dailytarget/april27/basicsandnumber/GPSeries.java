package com.jitu.dailytarget.april27.basicsandnumber;

//Display a geometric progression (GP) series.

public class GPSeries {
    public static void main(String[] args) {
        int fd=3;
        int cd=2;
        int term=5;
        int result=fd;
        for (int i = 1;i<=term;i++){
            result = result*cd;
            System.out.print(result+" ");
        }
    }
}
