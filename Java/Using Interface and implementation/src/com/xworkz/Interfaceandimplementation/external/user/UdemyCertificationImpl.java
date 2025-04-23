package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.CertificationRules;

public class UdemyCertificationImpl {
    private CertificationRules certificationRules;

    public UdemyCertificationImpl(CertificationRules certificationRules) {
        this.certificationRules = certificationRules;
    }

    public void generateCertificate() {
        if (certificationRules != null) {
            certificationRules.issueCertificate();
        } else {
            System.out.println("CertificationRules is null");
        }
    }
}


