package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.TransactionCompliance;

public class EWallet implements TransactionCompliance {
    @Override
    public void verifyKYC() {
        System.out.println("E-Wallet verifies KYC before transactions.");
    }
}