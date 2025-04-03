package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.SavingAccount;
import com.xworkz.IsARelation.internal.BankAccount;

public class SavingAccountRunner {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.checkBalance();
        savingAccount.closeAccount();
        savingAccount.deposit();
        savingAccount.transferMoney();
        savingAccount.withdraw();

        System.out.println("-----------------");

        BankAccount bankAccount = new SavingAccount();
        bankAccount.checkBalance();
        bankAccount.closeAccount();
        bankAccount.deposit();
        bankAccount.transferMoney();
        bankAccount.withdraw();
    }
}
