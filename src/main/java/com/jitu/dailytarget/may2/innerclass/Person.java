package com.jitu.dailytarget.may2.innerclass;


public class Person {

    private String name;
    private int age;
    private String nationality;

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    // Inner class
    public class Passport {
        private String passportNumber;

        public Passport(String passportNumber) {
            this.passportNumber = passportNumber;
        }

        public void printDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Nationality: " + nationality);
            System.out.println("Passport Number: " + passportNumber);
        }
    }

    // Main method to test
    public static void main(String[] args) {

        Person person = new Person("Raju", 30, "Indian");
        Person.Passport passport = person.new Passport("IN1234567");
        passport.printDetails();
        Person person1 = new Person("Sam",34,"Indian");
        Person.Passport passport1=person1.new Passport("IN156445");
      //  Passport passport2 = new Passport("asakdfnje");
    }
}


