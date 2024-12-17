package javaproject;
//SavingsAccount.java
public class SavingsAccount extends BankAccount {
 private static final double INTEREST_RATE = 0.02; // 2% annual interest

 public SavingsAccount(String accountHolder, double balance) {
     super(accountHolder, balance);
 }

 @Override
 public void applyInterest() {
     double interest = getBalance() * INTEREST_RATE;
     deposit(interest); // Add interest by calling deposit
     System.out.println("Interest applied: " + interest);
 }
}


