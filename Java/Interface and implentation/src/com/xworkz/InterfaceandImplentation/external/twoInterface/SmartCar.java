package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.SmartDevice;
import com.xworkz.InterfaceandImplentation.RulesClass.SmartFarm;

public class SmartCar implements SmartFarm, SmartDevice {
    @Override
    public void monitorCrops() {
        System.out.println("MonitorCrops method in two interface");
    }

    @Override
    public void automateIrrigation() {
        System.out.println("automateIrrigation method in two interface");

    }

    @Override
    public void analyzeSoil() {
        System.out.println("analyzeSoil method in two interface");

    }

    @Override public void turnOn() { System.out.println("SmartCar infotainment on."); }
    @Override public void operate() { System.out.println("SmartCar adjusting climate control."); }
    @Override public void turnOff() { System.out.println("SmartCar infotainment off."); }
}