package javaproject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public abstract class BankAccount {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;

    // Constructor to initialize account holder and balance
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    // Deposit method with timestamp
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;

        // Get current date and time
        String transactionTime = getCurrentDateTime();

        // Add transaction to history
        transactionHistory.add("Deposited: " + amount + ". Balance: " + balance + ". Time: " + transactionTime);
        System.out.println("Deposited: " + amount + ". New Balance: " + balance + ". Time: " + transactionTime);
    }

    // Withdraw method with timestamp
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

        // Get current date and time
        String transactionTime = getCurrentDateTime();

        // Add transaction to history
        transactionHistory.add("Withdrew: " + amount + ". Balance: " + balance + ". Time: " + transactionTime);
        System.out.println("Withdrew: " + amount + ". New Balance: " + balance + ". Time: " + transactionTime);
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }

    // Get account holder's name
    public String getAccountHolder() {
        return accountHolder;
    }

    // Print transaction history including date and time for each transaction
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

    // Abstract method for interest application (to be implemented in subclasses)
    public abstract void applyInterest();

    // Helper method to get current date and time
    private String getCurrentDateTime() {
        // Format the date and time as: YYYY-MM-DD HH:MM:SS
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return now.format(formatter);
    }
}

