package javaproject;

import java.util.HashMap;

public class Bank {
 private HashMap<String, Customer> customers;

 public Bank() {
     customers = new HashMap<>();
 }

 public void registerCustomer(String name, String customerId) {
     if (customers.containsKey(customerId)) {
         System.out.println("Customer with ID " + customerId + " already exists.");
     } else {
         customers.put(customerId, new Customer(name, customerId));
         System.out.println("Customer " + name + " registered successfully.");
     }
 }

 public Customer getCustomer(String customerId) {
     return customers.get(customerId);
 }
}

