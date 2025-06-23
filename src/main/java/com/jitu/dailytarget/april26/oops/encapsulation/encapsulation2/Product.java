package com.jitu.dailytarget.april26.oops.encapsulation.encapsulation2;

//Design a Product class where the price should not be negative. Use setters with validation.

public class Product {

    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price>0){
            this.price = price;
        }
        else System.out.println("Price Can not be less then 1: ");
    }
}
