package com.jitu.dailytarget.may12.getterssetters;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.accountNumber=345666;
        bankAccount.setBalance(345.78f);
        System.out.println(bankAccount.getBalance());
    }
}
