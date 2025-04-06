package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.SavingAccount;
import com.xworkz.IsARelation.internal.BankAccount;
import com.xworkz.IsARelation.internal.BoardGame;

public class SavingAccountRunner {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.checkBalance();
        bankAccount1.closeAccount();
        bankAccount1.deposit();
        bankAccount1.transferMoney();
        bankAccount1.withdraw();

        System.out.println("-----------------");
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
