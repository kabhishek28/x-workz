package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.LoanApprovalPolicy;

public class BankingSystem implements LoanApprovalPolicy {
    @Override
    public void approveLoan() {
        System.out.println("Banking system is evaluating and approving loan requests.");
    }
}