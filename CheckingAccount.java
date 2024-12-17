package javaproject;

public class CheckingAccount extends BankAccount {
 private double overdraftLimit;

 public CheckingAccount(String accountHolder, double balance) {
     super(accountHolder, balance);
     this.overdraftLimit = 500.0;  // Default overdraft limit
 }

 
 public void withdraw(double amount) {
     if (amount <= 0) {
         System.out.println("Withdrawal amount must be positive.");
         return;
     }
     if (amount > getBalance() + overdraftLimit) {
         System.out.println("Insufficient funds and overdraft limit reached.");
         return;
     }
     super.withdraw(amount); // Call the parent class method to withdraw
 }

 public void setOverdraftLimit(double limit) {
     this.overdraftLimit = limit;
     System.out.println("Overdraft limit updated to: " + overdraftLimit);
 }


public void applyInterest() {

	
}
}

