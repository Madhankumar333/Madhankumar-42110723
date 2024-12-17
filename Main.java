package javaproject;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Bank bank = new Bank();

     while (true) {
         System.out.println("\nWelcome to the Bank!");
         System.out.println("1. Register Customer");
         System.out.println("2. Create Account");
         System.out.println("3. View Accounts");
         System.out.println("4. Make Transaction (Deposit/Withdraw)");
         System.out.println("5. Check Balance");
         System.out.println("6. Apply Interest (for Savings Accounts)");
         System.out.println("7. View Transaction History");
         System.out.println("8. Exit");

         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine();  

         switch (choice) {
             case 1: {
                 System.out.print("Enter customer name: ");
                 String name = scanner.nextLine();
                 System.out.print("Enter customer ID: ");
                 String customerId = scanner.nextLine();
                 bank.registerCustomer(name, customerId);
                 break;
             }
             case 2: {
                 System.out.print("Enter customer ID: ");
                 String customerId = scanner.nextLine();
                 Customer customer = bank.getCustomer(customerId);
                 if (customer != null) {
                     System.out.print("Enter account type (Savings/Checking): ");
                     String accountType = scanner.nextLine();
                     System.out.print("Enter initial balance: ");
                     double balance = scanner.nextDouble();
                     customer.createAccount(accountType, balance);
                 } else {
                     System.out.println("Customer not found.");
                 }
                 break;
             }
             case 3: {
                 System.out.print("Enter customer ID: ");
                 String customerId = scanner.nextLine();
                 Customer customer = bank.getCustomer(customerId);
                 if (customer != null) {
                     customer.printAccounts();
                 } else {
                     System.out.println("Customer not found.");
                 }
                 break;
             }
             case 4: {
                 System.out.print("Enter customer ID: ");
                 String customerId = scanner.nextLine();
                 Customer customer = bank.getCustomer(customerId);
                 if (customer != null) {
                     System.out.print("Enter account type (Savings/Checking): ");
                     String accountType = scanner.nextLine();
                     BankAccount account = customer.getAccount(accountType);
                     if (account != null) {
                         System.out.print("Enter transaction type (deposit/withdraw): ");
                         String transactionType = scanner.nextLine();
                         System.out.print("Enter amount: ");
                         double amount = scanner.nextDouble();
                         Transaction transaction = new Transaction(transactionType, amount, account);
                         transaction.execute();
                     } else {
                         System.out.println("Account not found.");
                     }
                 } else {
                     System.out.println("Customer not found.");
                 }
                 break;
             }
             case 5: {
                 System.out.print("Enter customer ID: ");
                 String customerId = scanner.nextLine();
                 Customer customer = bank.getCustomer(customerId);
                 if (customer != null) {
                     System.out.print("Enter account type (Savings/Checking): ");
                     String accountType = scanner.nextLine();
                     BankAccount account = customer.getAccount(accountType);
                     if (account != null) {
                         System.out.println("Balance: " + account.getBalance());
                     } else {
                         System.out.println("Account not found.");
                     }
                 } else {
                     System.out.println("Customer not found.");
                 }
                 break;
             }
             case 6: {
                 System.out.print("Enter customer ID: ");
                 String customerId = scanner.nextLine();
                 Customer customer = bank.getCustomer(customerId);
                 if (customer != null) {
                     System.out.print("Enter account type (Savings/Checking): ");
                     String accountType = scanner.nextLine();
                     BankAccount account = customer.getAccount(accountType);
                     if (account != null && account instanceof SavingsAccount) {
                         ((SavingsAccount) account).applyInterest();
                     } else {
                         System.out.println("Interest can only be applied to Savings accounts.");
                     }
                 } else {
                     System.out.println("Customer not found.");
                 }
                 break;
             }
             case 7: {
                 System.out.print("Enter customer ID: ");
                 String customerId = scanner.nextLine();
                 Customer customer = bank.getCustomer(customerId);
                 if (customer != null) {
                     System.out.print("Enter account type (Savings/Checking): ");
                     String accountType = scanner.nextLine();
                     BankAccount account = customer.getAccount(accountType);
                     if (account != null) {
                         account.printTransactionHistory();
                     } else {
                         System.out.println("Account not found.");
                     }
                 } else {
                     System.out.println("Customer not found.");
                 }
                 break;
             }
             case 8: {
                 System.out.println("Thank you for using the bank system!");
                 scanner.close();
                 return;
             }
             default:
                 System.out.println("Invalid option, please try again.");
         }
     }
 }
}

