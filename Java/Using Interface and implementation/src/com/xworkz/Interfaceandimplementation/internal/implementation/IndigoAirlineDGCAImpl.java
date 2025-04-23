package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.DGCA;

public class IndigoAirlineDGCAImpl implements DGCA {
    public IndigoAirlineDGCAImpl() {
        System.out.println("IndigoAirlineDGCAImpl const");
    }

    @Override
    public void followFlightRules() {
        System.out.println("followFlightRules method in IndigoAirlineDGCAImpl class");
    }
}
