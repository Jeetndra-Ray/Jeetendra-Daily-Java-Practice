package com.jitu.dailytarget.april27.customeexceptionh.insufficientbalanceexception;

public class BankTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(4);
        bankAccount.withdraw(10);
        bankAccount.deposit(0);
        bankAccount.current_balance();
    }
}
