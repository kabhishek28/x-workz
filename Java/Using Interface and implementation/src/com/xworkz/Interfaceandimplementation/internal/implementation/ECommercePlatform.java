package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.PaymentSecurity;

public class ECommercePlatform implements PaymentSecurity {
    @Override
    public void processTransactions() {
        System.out.println("E-commerce platform processes transactions securely.");
    }
}