package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.IOTSecurity;

public class SmartHomeDevice implements IOTSecurity {
    @Override
    public void encryptData() {
        System.out.println("Smart home device encrypts user data securely.");
    }
}