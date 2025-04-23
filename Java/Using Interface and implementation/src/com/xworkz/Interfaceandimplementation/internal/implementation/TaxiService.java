package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.TransportRules;

public class TaxiService implements TransportRules {
    @Override
    public void followTrafficLaws() {
        System.out.println("TaxiService follows all traffic laws as per transport rules.");
    }
}