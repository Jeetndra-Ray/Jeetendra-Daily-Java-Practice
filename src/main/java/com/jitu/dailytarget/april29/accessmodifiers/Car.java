package com.jitu.dailytarget.april29.accessmodifiers;

public class Car {


    int num = 10;

    // Have call this method in 4 difference scenario, in different-package, sub-packages,
    // child class from different-package ,and same packages.  but worked only with "SAME PACKAGE":
    void startEngine(){
        System.out.println("Engine has been started");
    }

}
