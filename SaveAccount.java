package com.niit;

public class SaveAccount extends Account {
 double amount;

 public SaveAccount(double amount)
 {
  this.amount = amount;
 }
 public void checkAvailableBalance()
 {
  System.out.println(" Available balance : "+amount);
 }

 public void calculateInterest()
 {
  double amt;
    float interestRate=2.5f;
    amt=(amount*interestRate)/100;
    System.out.println(" your interest amount is  :  "+amt);

 }

public void withdrawn(int withdrawal)
 {
  if (amount > withdrawal) {
   System.out.println(" withdrawn amount : " + withdrawal);
   amount = amount - withdrawal;
   System.out.println(" Balance after withdrawal : " + amount);
  }
  else
  {
   System.out.println(" insufficient balance in your account : "+amount);
  }
 }
 public void deposit(int deposit)
 {
  System.out.println(" deposited amount : " + deposit);

  amount = amount+ deposit;

  System.out.println(" Balance after deposit : " + amount);
 }
}