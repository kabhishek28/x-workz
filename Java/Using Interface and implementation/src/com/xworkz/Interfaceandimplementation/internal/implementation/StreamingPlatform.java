package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.CopyrightRules;

public class StreamingPlatform implements CopyrightRules {
    @Override
    public void verifyLicense() {
        System.out.println("Streaming platform verifies content license before streaming.");
    }
}