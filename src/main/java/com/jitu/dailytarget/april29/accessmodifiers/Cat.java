package com.jitu.dailytarget.april29.accessmodifiers;

import com.jitu.dailytarget.april29.accessmodifiers.animal.Animal;

public class Cat extends Animal {
    public void dogSound(){
        super.makeSound();
    }

    @Override
    protected void makeSound() {
        System.out.println("Dog Sound");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.animalType="Cat";
        cat.name="Sky";
        cat.makeSound();
        cat.dogSound();
    }
}
