package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.BankAccount;

public class SavingAccount extends BankAccount {
    public SavingAccount(){
        System.out.println("no arguments const of SavingAccount");
    }
@Override
    public void deposit() { System.out.println("@Override :Deposit successful"); }
    @Override
    public void withdraw() { System.out.println("@Override :Withdrawal successful"); }
    @Override
    public void checkBalance() { System.out.println("@Override :Checking balance"); }
    @Override
    public void transferMoney() { System.out.println("@Override :Money transferred"); }
    @Override
    public void closeAccount() { System.out.println("@Override Account closed"); }
}

