package com.jitu.dailytarget.may28;

public class Nim_Game {
    public static boolean canWinNim(int n){
        int resul = n/3;
        if(resul%2!=0){
            return false;
        }else {return true;}
    }

    public static void main(String[] args) {
        int n =4;
        System.out.println( canWinNim(n));
    }

}
