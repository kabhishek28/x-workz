package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.TransactionRules;

public class OnlineBanking implements TransactionRules {
    @Override
    public void processTransaction() {
        System.out.println("Online banking system processes transactions securely.");
    }
}