package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.IOTSecurity;

public class AlexaSecurityImpl {
    private IOTSecurity iotSecurity;

    public AlexaSecurityImpl(IOTSecurity iotSecurity) {
        this.iotSecurity = iotSecurity;
    }

    public void secureDevice() {
        if (iotSecurity != null) {
            iotSecurity.encryptData();
        } else {
            System.out.println("IOTSecurity is null");
        }
    }
}

