package com.jitu.dailytarget.april25.oops.inheritance.inheritance1;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Cat cat = new Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
