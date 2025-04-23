package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.PaymentSecurity;

public class FlipkartPaymentImpl {
    private PaymentSecurity paymentSecurity;

    public FlipkartPaymentImpl(PaymentSecurity paymentSecurity) {
        this.paymentSecurity = paymentSecurity;
    }

    public void startTransaction() {
        if (paymentSecurity != null) {
            paymentSecurity.processTransactions();
        } else {
            System.out.println("PaymentSecurity is null");
        }
    }
}