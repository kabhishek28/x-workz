package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.KYCVerification;

public class PhonePeKYCImpl {
    private KYCVerification kycVerification;

    public PhonePeKYCImpl(KYCVerification kycVerification) {
        this.kycVerification = kycVerification;
    }

    public void startVerification() {
        if (kycVerification != null) {
            kycVerification.verifyUser();
        } else {
            System.out.println("KYCVerification is null");
        }
    }
}

