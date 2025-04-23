package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.KYCVerification;

public class DigitalWallet implements KYCVerification {
    @Override
    public void verifyUser() {
        System.out.println("Digital wallet is verifying user identity via KYC.");
    }
}