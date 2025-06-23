package com.jitu.dailytarget.april27.basicsandnumber;

//Display an arithmetic progression (AP) series.

public class APSeries {
    public static void main(String[] args) {
        int fd=2;
        int cd=3;
        int term=5;
        int result=fd;
        for (int i = 1;i<=term;i++){
            result = result+cd;
            System.out.print(result+",");
        }
    }
}
