package com.jitu.dailytarget.april26.oops.encapsulation.encapsulation2;

public class ProductTest {
    public static void main(String[] args) {
        Product product =new Product();
        product.setPrice(0);
        System.out.println(product.getPrice());
        product.setPrice(34.54f);
        System.out.println(product.getPrice());
    }
}
