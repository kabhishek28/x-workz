package com.xworkz.typesofinheritance.Hierarchical.external;

import com.xworkz.typesofinheritance.Hierarchical.internal.BankAccount;

public class SavingsAccount extends BankAccount {
    public void interest() {
        System.out.println("Adding interest to savings.");
    }
}