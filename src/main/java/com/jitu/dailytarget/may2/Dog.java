package com.jitu.dailytarget.may2;

public class Dog extends Mammal{
    public Dog(String animalName) {
        super(animalName);
    }

    @Override
    void makeSound() {
        System.out.println(animalName+" : bark");
    }

    @Override
    void eatFood() {
        System.out.println(animalName+" Eat Both Veg And Non-Veg");
    }

}
