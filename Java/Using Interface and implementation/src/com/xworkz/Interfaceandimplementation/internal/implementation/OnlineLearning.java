package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.CertificationRules;

public class OnlineLearning implements CertificationRules {
    @Override
    public void issueCertificate() {
        System.out.println("Online learning platform issues certificates after course completion.");
    }
}
