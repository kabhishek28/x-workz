package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.HydroPowerPlant;
import com.xworkz.InterfaceandImplentation.RulesClass.IrrigationSystem;

public class Agriculture implements IrrigationSystem, HydroPowerPlant {
    @Override
    public void startTurbine() {
        System.out.println("start Turbine in two Implements");
    }

    @Override
    public void regulateFlow() {
        System.out.println("regulateFlow  in two Implements");
    }

    @Override
    public void shutdownPlant() {
        System.out.println("shutdownPlant  in two Implements");
    }

    @Override
    public void startIrrigation() {
        System.out.println("startIrrigation  in two Implements");
    }

    @Override
    public void monitorSoilMoisture() {
        System.out.println("monitorSoilMoisture  in two Implements");
    }

    @Override
    public void stopIrrigation() {
        System.out.println("stopIrrigation  in two Implements");
    }
}
