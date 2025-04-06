package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Bank;

public class SBI extends Bank {

    public SBI() {
        System.out.println("No-argument constructor: SBI Bank");
    }

@Override
    public void deposit() {
        System.out.println("@Override :Deposit money in bank");
    }
    @Override
    public void withdraw() {
        System.out.println("@Override :Withdraw money from bank");
    }
    @Override
    public void loan() {
        System.out.println("@Override :Bank provides loans");
    }
    @Override
    public void interestRate() {
        System.out.println("@Override :Bank has a standard interest rate");
    }
    @Override
    public void branchInfo() {
        System.out.println("@Override :Bank has multiple branches");
    }
}
