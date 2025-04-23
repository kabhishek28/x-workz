package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.TransactionCompliance;

public class PhonePeComplianceImpl {
    private TransactionCompliance compliance;

    public PhonePeComplianceImpl(TransactionCompliance compliance) {
        this.compliance = compliance;
    }

    public void checkCompliance() {
        if (compliance != null) {
            compliance.verifyKYC();
        } else {
            System.out.println("TransactionCompliance is null");
        }
    }
}
