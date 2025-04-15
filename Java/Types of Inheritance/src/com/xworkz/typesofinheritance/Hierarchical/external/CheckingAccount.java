package com.xworkz.typesofinheritance.Hierarchical.external;

import com.xworkz.typesofinheritance.Hierarchical.internal.BankAccount;

public class CheckingAccount extends BankAccount {
    public void withdraw() {
        System.out.println("Withdrawing money.");
    }
}