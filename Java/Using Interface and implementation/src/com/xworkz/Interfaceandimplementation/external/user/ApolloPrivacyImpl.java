package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.DataPrivacyPolicy;

public class ApolloPrivacyImpl {
    private DataPrivacyPolicy privacyPolicy;

    public ApolloPrivacyImpl(DataPrivacyPolicy privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
    }

    public void secureData() {
        if (privacyPolicy != null) {
            privacyPolicy.encryptRecords();
        } else {
            System.out.println("DataPrivacyPolicy is null");
        }
    }
}

