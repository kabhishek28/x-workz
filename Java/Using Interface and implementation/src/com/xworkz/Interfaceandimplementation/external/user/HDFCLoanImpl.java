package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.LoanApprovalPolicy;

public class HDFCLoanImpl {
    private LoanApprovalPolicy loanPolicy;

    public HDFCLoanImpl(LoanApprovalPolicy loanPolicy) {
        this.loanPolicy = loanPolicy;
    }

    public void approveCustomerLoan() {
        if (loanPolicy != null) {
            loanPolicy.approveLoan();
        } else {
            System.out.println("LoanApprovalPolicy is null");
        }
    }
}
