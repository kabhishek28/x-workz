package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.PrivacyPolicy;

public class FacebookPrivacyImpl {
    private PrivacyPolicy privacyPolicy;

    public FacebookPrivacyImpl(PrivacyPolicy privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
    }

    public void applyPrivacy() {
        if (privacyPolicy != null) {
            privacyPolicy.enforcePrivacy();
        } else {
            System.out.println("PrivacyPolicy is null");
        }
    }
}

