package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.SBI;
import com.xworkz.IsARelation.internal.Bank;

public class SBIRunner {
    public static void main(String[] args) {
        Bank bank = new SBI();
        bank.deposit();
        bank.withdraw();
        bank.loan();
        bank.interestRate();
        bank.branchInfo();

        System.out.println("******************");

        SBI sbi = new SBI();
        sbi.deposit();
        sbi.withdraw();
        sbi.loan();
        sbi.interestRate();
        sbi.branchInfo();
    }
}
