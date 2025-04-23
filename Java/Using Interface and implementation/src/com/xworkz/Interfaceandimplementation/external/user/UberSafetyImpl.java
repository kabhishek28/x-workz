package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.SafetyPolicy;

public class UberSafetyImpl {
    private SafetyPolicy safetyPolicy;

    public UberSafetyImpl(SafetyPolicy safetyPolicy) {
        this.safetyPolicy = safetyPolicy;
    }

    public void ensureSafety() {
        if (safetyPolicy != null) {
            safetyPolicy.monitorDriver();
        } else {
            System.out.println("SafetyPolicy is null");
        }
    }
}
