package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.DriverConductRules;

public class TaxiManagementApp  implements DriverConductRules {
    @Override
    public void maintainBehavior() {
        System.out.println("Ride-sharing platform enforces driver behavior standards.");
    }
}
