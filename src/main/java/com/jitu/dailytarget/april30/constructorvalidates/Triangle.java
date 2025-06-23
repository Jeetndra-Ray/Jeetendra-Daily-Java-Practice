package com.jitu.dailytarget.april30.constructorvalidates;

//Create a class Triangle with a constructor that validates side lengths.
// If invalid (sum of any two ≤ third), throw IllegalArgumentException.

public class Triangle {
    float side1;
    float side2;
    float side3;
    public Triangle(float side1,float side2,float side3){
        if (validate(side1,side2,side3)){
            this.side1=side1;
            this.side2=side2;
            this.side3=side3;
        } else throw new IllegalArgumentException("Invalid triangle sides: The sum of any two sides must be greater than the third side.\"");

    }

    public boolean validate( float side1,float side2,float side3){
        if (side1+side2>side3 && side2+side3>side1 && side1+side3>side2)
            return true;
        else return false;
    }

    public void displaySides() {
        System.out.println("Side A: " + side1);
        System.out.println("Side B: " + side2);
        System.out.println("Side C: " + side3);
    }
}
