package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.WashingMachine;
import com.xworkz.IsARelation.internal.Appliance;

public class WashingMachineRunner {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.function();
        washingMachine.maintenance();
        washingMachine.turnOff();
        washingMachine.turnOn();
        washingMachine.warranty();
        System.out.println("----------------");
        Appliance appliance = new WashingMachine();
        appliance.function();
        appliance.maintenance();
        appliance.turnOff();
        appliance.turnOn();
        appliance.warranty();
    }
}
