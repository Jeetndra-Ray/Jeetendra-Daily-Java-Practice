package com.jitu.dailytarget.april27.customeexceptionh.insufficientbalanceexception;

public class BankAccount {
        private float account_balance;


        public void deposit(float amount) {
            if (amount > 0) {
                this.account_balance += amount;
            } else System.out.println("Invalid deposit amount.");
        }

    public void withdraw(float amount) throws InsufficientBalanceException{
       try {

           if (amount > 0 && amount < this.account_balance) {
               this.account_balance = this.account_balance - amount;
           } else if (amount <= 0) {
               throw new InvalidWithdrawal("Invalid withdrawal amount");
           } else {
               throw new InsufficientBalanceException("Insufficient funds.");
           }
       }catch (InsufficientBalanceException e){
           System.out.println(e.getMessage());
       }
       catch (InvalidWithdrawal e){
           System.out.println(e.getMessage());
       }

    }

        public void current_balance(){
            System.out.println("Your Current Bank Balance is: " + this.account_balance);
        }
}

