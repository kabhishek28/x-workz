package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.SafetyPolicy;

public class RideSharingApp implements SafetyPolicy {
    @Override
    public void monitorDriver() {
        System.out.println("Ride-sharing app monitors driver behavior for safety.");
    }
}