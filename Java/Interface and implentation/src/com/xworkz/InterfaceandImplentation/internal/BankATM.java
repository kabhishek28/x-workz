package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.ATMMachine;

public class BankATM implements ATMMachine {
    @Override
    public void dispenseCash() {
        System.out.println("Dispensing cash to the customer.");
    }

    @Override
    public void acceptCard() {
        System.out.println("Accepting customer's ATM card.");
    }

    @Override
    public void printReceipt() {
        System.out.println("Printing transaction receipt.");
    }
}