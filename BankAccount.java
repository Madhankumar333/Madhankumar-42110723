package javaproject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public abstract class BankAccount {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;

    
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }


    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;

        
        String transactionTime = getCurrentDateTime();

    
        transactionHistory.add("Deposited: " + amount + ". Balance: " + balance + ". Time: " + transactionTime);
        System.out.println("Deposited: " + amount + ". New Balance: " + balance + ". Time: " + transactionTime);
    }

    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;

        
        String transactionTime = getCurrentDateTime();

        
        transactionHistory.add("Withdrew: " + amount + ". Balance: " + balance + ". Time: " + transactionTime);
        System.out.println("Withdrew: " + amount + ". New Balance: " + balance + ". Time: " + transactionTime);
    }

    
    public double getBalance() {
        return balance;
    }

    
    public String getAccountHolder() {
        return accountHolder;
    }

    public void printTransactionHistory() {
        System.out.println("\nTransaction History for " + accountHolder + ":");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }

 
    public abstract void applyInterest();

    private String getCurrentDateTime() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return now.format(formatter);
    }
}

