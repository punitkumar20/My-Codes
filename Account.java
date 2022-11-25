package com.niit;

import java.util.Random;

public class Account
{
    public static void main(String[] args)
    {
       BankAccount account1= new BankAccount();
       System.out.println("Savings account details");
        account1.generatedAccountNumber();
        SaveAccount saveAccount=new SaveAccount(10000);
        saveAccount.calculateInterest();
        saveAccount.checkAvailableBalance();

        saveAccount.withdrawn(2000);
        saveAccount.deposit(1000);


       System.out.println("\nPay account details");
       BankAccount account2=new BankAccount();
        account2.generatedAccountNumber();
        payAccount payAccount=new payAccount();
        payAccount.calculateInterest();



    }

}