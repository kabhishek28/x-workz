package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.PrivacyPolicy;

public class SocialMediaApp implements PrivacyPolicy {
    @Override
    public void enforcePrivacy() {
        System.out.println("Social media app enforces privacy rules for users.");
    }
}
