package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.TransactionRules;

public class HDFCTransactionImpl {
    private TransactionRules transactionRules;

    public HDFCTransactionImpl(TransactionRules transactionRules) {
        this.transactionRules = transactionRules;
    }

    public void completeTransaction() {
        if (transactionRules != null) {
            transactionRules.processTransaction();
        } else {
            System.out.println("TransactionRules is null");
        }
    }
}
