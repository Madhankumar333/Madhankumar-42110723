package javaproject;
//Transaction.java
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
 private String transactionType;
 private double amount;
 private BankAccount account;
 private String timestamp;

 public Transaction(String transactionType, double amount, BankAccount account) {
     this.transactionType = transactionType;
     this.amount = amount;
     this.account = account;
     this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
 }

 public void execute() {
     if ("deposit".equalsIgnoreCase(transactionType)) {
         account.deposit(amount);
     } else if ("withdraw".equalsIgnoreCase(transactionType)) {
         account.withdraw(amount);
     } else {
         System.out.println("Invalid transaction type.");
     }
     System.out.println("Transaction completed at " + timestamp);
 }
}

