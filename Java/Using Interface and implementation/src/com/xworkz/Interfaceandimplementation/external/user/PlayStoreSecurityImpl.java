package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.DigitalSecurity;

public class PlayStoreSecurityImpl {
    private DigitalSecurity digitalSecurity;

    public PlayStoreSecurityImpl(DigitalSecurity digitalSecurity) {
        this.digitalSecurity = digitalSecurity;
    }

    public void performAppCheck() {
        if (digitalSecurity != null) {
            digitalSecurity.verifyApps();
        } else {
            System.out.println("DigitalSecurity is null");
        }
    }
}