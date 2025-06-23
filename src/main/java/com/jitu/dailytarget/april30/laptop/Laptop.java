package com.jitu.dailytarget.april30.laptop;

//Create a class Laptop with private fields (brand, ram, price) and a constructor to initialize them. Add a method to display laptop details.

public class Laptop {
    private String brand;
    private int ram;
    private float price;

    private Laptop(String brand, int ram, float price){
        this.brand=brand;
        this.price=price;
        this.ram=ram;
    }

    private float getPrice(){
        return price;
    }
    private String getBrand(){
        return brand;
    }
    private int getRam(){
        return ram;
    }

    private void setPrice(float price) {
        this.price = price;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    private void setRam(int ram) {
        this.ram = ram;
    }

    public void displaydisplaylaptopdetails(){
        System.out.println("Laptop Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price in Rupees: " + price);
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo",8,45600.76f);
        laptop.displaydisplaylaptopdetails();
    }
}
