package javaproject;


import java.util.HashMap;

public class Customer {
 private String name;
 private String customerId;
 private HashMap<String, BankAccount> accounts;

 public Customer(String name, String customerId) {
     this.name = name;
     this.customerId = customerId;
     this.accounts = new HashMap<>();
 }

 public void createAccount(String accountType, double initialBalance) {
     if ("Savings".equalsIgnoreCase(accountType)) {
         BankAccount account = new SavingsAccount(name, initialBalance);
         accounts.put("Savings", account);
         System.out.println("Savings account created for " + name);
     } else if ("Checking".equalsIgnoreCase(accountType)) {
         BankAccount account = new CheckingAccount(name, initialBalance);
         accounts.put("Checking", account);
         System.out.println("Checking account created for " + name);
     } else {
         System.out.println("Invalid account type.");
     }
 }

 public BankAccount getAccount(String accountType) {
     return accounts.get(accountType);
 }

 public void printAccounts() {
     System.out.println("Accounts for " + name + ":");
     for (String accountType : accounts.keySet()) {
         System.out.println(accountType + " Account - Balance: " + accounts.get(accountType).getBalance());
     }
 }

 public String getCustomerId() {
     return customerId;
 }

 public String getName() {
     return name;
 }
}
