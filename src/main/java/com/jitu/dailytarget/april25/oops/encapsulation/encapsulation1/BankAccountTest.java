package com.jitu.dailytarget.april25.oops.encapsulation.encapsulation1;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(23455);
        bankAccount.deposit(45455);
        bankAccount.current_balance();
        bankAccount.withdraw(5000);
        bankAccount.current_balance();

    }
}
