package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.ElectricVehicle;

public class TeslaCar extends ElectricVehicle {

    public TeslaCar() {
        System.out.println("No-argument constructor: Tesla Car");
    }

@Override
    public void chargeBattery() {
        System.out.println("@Override :Electric Vehicle is charging");
    }
    @Override
    public void drive() {
        System.out.println("@Override :Electric Vehicle is driving");
    }
    @Override
    public void autopilot() {
        System.out.println("@Override :Electric Vehicle is using autopilot mode");
    }
    @Override
    public void energyConsumption() {
        System.out.println("@Override :Electric Vehicle is monitoring energy usage");
    }
    @Override
    public void ecoMode() {
        System.out.println("@Override :Electric Vehicle is running in eco mode");
    }
}