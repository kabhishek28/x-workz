package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.SmartDevice;
import com.xworkz.InterfaceandImplentation.RulesClass.SmartHomeAppliance;

public class SmartAppliance implements SmartDevice, SmartHomeAppliance {
    @Override
    public void turnOn() {
        System.out.println("turnOn method in two interface");
    }

    @Override
    public void operate() {
        System.out.println("operate method in two interface");
    }

    @Override
    public void turnOff() {
        System.out.println("turnOff method in two interface");
    }

    @Override
    public void activate() {
        System.out.println("activate method in two interface");
    }

    @Override
    public void performTask() {
        System.out.println("performTask method in two interface");
    }

    @Override
    public void deactivate() {
        System.out.println("deactivate method in two interface");
    }
}
