package com.jitu.dailytarget.april25.oops.encapsulation.encapsulation1;

// Write a BankAccount class that hides account balance. Provide methods to deposit, withdraw, and get the current balance.

public class BankAccount {
    private float account_balance;


    public void deposit(float amount) {
        if (amount > 0) {
            this.account_balance += amount;
        } else System.out.println("Invalid deposit amount.");
    }

    public void withdraw(float amount) {
        if (amount > 0 && amount < this.account_balance) {
            this.account_balance = this.account_balance - amount;
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            System.out.println("Insufficient funds.");
        }

    }

    public void current_balance(){
        System.out.println("Your Current Bank Balance is: " + this.account_balance);
    }



}
