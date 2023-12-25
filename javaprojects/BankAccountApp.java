package com.javaprojects;

import java.util.*;

public class BankAccountApp {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '1' for deposit \nEnter '2' for withdraw");
        int in = sc.nextInt();
        Bank b = new Bank();
        try {
            if (in == 1) {
            	System.out.println("Enter your Amount to Deposit");
                double d = sc.nextDouble();
                b.deposit(d);
                System.out.println("Current Balance : $" + b.getBalance());
            } else if (in == 2) {
            	System.out.println("Enter your Amount to Withdraw");
                double w = sc.nextDouble();
                b.withdraw(w);
                System.out.println("Current Balance : $" + b.getBalance());
            }
        } catch (NegativeAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

class Bank {
    double balance = 500;
    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative");
        }
        balance = balance + amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, NegativeAmountException {
        if (amount < 0) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}

class NegativeAmountException extends RuntimeException {
    NegativeAmountException(String msg) {
        super(msg);
    }
}

class InsufficientBalanceException extends RuntimeException {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}