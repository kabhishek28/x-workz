package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.DriverConductRules;

public class UberDriverConductImpl {
    private DriverConductRules rules;

    public UberDriverConductImpl(DriverConductRules rules) {
        this.rules = rules;
    }

    public void reviewDriverConduct() {
        if (rules != null) {
            rules.maintainBehavior();
        } else {
            System.out.println("DriverConductRules is null");
        }
    }
}
