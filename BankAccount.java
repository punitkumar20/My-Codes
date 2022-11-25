package com.niit;

import java.util.Random;

public class BankAccount extends Account
{
    public void generatedAccountNumber()
    {
        Random rnd = new Random();
        long accNumber = rnd.nextLong(Long.parseLong("999999999999"));

        System.out.println("Account number : "+accNumber);


    }
}
