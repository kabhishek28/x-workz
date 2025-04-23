package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.DigitalSecurity;

public class AppStore implements DigitalSecurity {
    @Override
    public void verifyApps() {
        System.out.println("AppStore verifies apps before publishing to ensure digital safety.");
    }
}