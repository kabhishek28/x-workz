package com.xworkz.IsARelation.internal;

public class BankAccount {
    public BankAccount() {
        System.out.println("no argument const of BankAccount");
    }
    public void deposit() { System.out.println("Deposit successful"); }
    public void withdraw() { System.out.println("Withdrawal successful"); }
    public void checkBalance() { System.out.println("Checking balance"); }
    public void transferMoney() { System.out.println("Money transferred"); }
     public void closeAccount() { System.out.println("Account closed"); }
}

