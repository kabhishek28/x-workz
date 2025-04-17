package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.IrrigationSystem;

public class FieldIrrigationSystem implements IrrigationSystem {
    @Override
    public void startIrrigation() {
        System.out.println("Irrigation system activated to water the field.");
    }

    @Override
    public void monitorSoilMoisture() {
        System.out.println("Monitoring soil moisture levels.");
    }

    @Override
    public void stopIrrigation() {
        System.out.println("Irrigation system deactivated.");
    }
}