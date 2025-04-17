package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.SmartDevice;

public class SmartLight implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart light turned on.");
    }

    @Override
    public void operate() {
        System.out.println("Smart light brightness adjusted.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart light turned off.");
    }
}