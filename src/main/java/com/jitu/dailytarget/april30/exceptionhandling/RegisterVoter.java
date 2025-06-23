package com.jitu.dailytarget.april30.exceptionhandling;

public class RegisterVoter {

    public static void registerVoter(int age){
        if (age<18){
            throw new InvalidAgeException("You are not eligible for voting");
        }
        else{
            System.out.println("Welcome thank you for registration ");
        }
    }

    public static void main(String[] args) {
        try {
            registerVoter(3);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
