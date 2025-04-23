package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.DataPrivacyPolicy;

public class HealthCareSystem implements DataPrivacyPolicy {
    @Override
    public void encryptRecords() {
        System.out.println("HealthCare system encrypts patient records securely.");
    }
}
