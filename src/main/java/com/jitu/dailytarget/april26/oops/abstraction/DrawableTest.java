package com.jitu.dailytarget.april26.oops.abstraction;

public class DrawableTest {
    public static void main(String[] args) {
        Drawable drawable = new Circle();
        drawable.draw();
        Drawable drawable1 = new Square();
        drawable1.draw();
        Drawable drawable2 = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing");
            }
        };
        drawable2.draw();
    }
}
