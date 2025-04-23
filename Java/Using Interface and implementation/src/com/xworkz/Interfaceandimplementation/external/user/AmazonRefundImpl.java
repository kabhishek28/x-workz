package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.RefundPolicy;

public class AmazonRefundImpl {
    private RefundPolicy refundPolicy;

    public AmazonRefundImpl(RefundPolicy refundPolicy) {
        this.refundPolicy = refundPolicy;
    }

    public void refundCustomer() {
        if (refundPolicy != null) {
            refundPolicy.processRefund();
        } else {
            System.out.println("RefundPolicy is null");
        }
    }
}
