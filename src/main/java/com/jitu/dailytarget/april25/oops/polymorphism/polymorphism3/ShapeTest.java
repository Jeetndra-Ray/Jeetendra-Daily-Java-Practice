package com.jitu.dailytarget.april25.oops.polymorphism.polymorphism3;

public class ShapeTest {

    public class Main {
        public static void main(String[] args) {
            Shape myShape = new Shape();
            Shape myCircle = new Circle();
            Shape myRectangle = new Rectangle();

            myShape.draw();
            myCircle.draw();
            myRectangle.draw();
        }
    }
}