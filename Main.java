package com.bank;


public class Main {
    public static void main(String[] args) {

        // Creating multiple account objects
        BankAccount acc1 = new BankAccount(101, "Ritik", 5000);
        BankAccount acc2 = new BankAccount(102, "Aman", 3000);

        // Object interaction
        acc1.deposit(2000);
        acc1.withdraw(1500);

        acc2.deposit(1000);
        acc2.withdraw(5000);

        // Display details
        System.out.println("Account Holder: " + acc1.getAccountHolderName());
        System.out.println("Balance: " + acc1.getBalance());
        acc1.showTransactionHistory();

        System.out.println("\n-----------------------\n");

        System.out.println("Account Holder: " + acc2.getAccountHolderName());
        System.out.println("Balance: " + acc2.getBalance());
        acc2.showTransactionHistory();
    }
}