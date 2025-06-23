package com.jitu.dailytarget.april29.accessmodifiers.privatemethod;

public class Parent {

    private int a=10;

   private int getA() {
        return a;
    }

    private void setA(int a) {
        this.a = a;
    }

    private void method(){
        System.out.println("This is a Privet Method");
    }
}
