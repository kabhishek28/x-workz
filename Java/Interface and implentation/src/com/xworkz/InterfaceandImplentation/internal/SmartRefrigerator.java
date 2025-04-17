package com.xworkz.InterfaceandImplentation.internal;


import com.xworkz.InterfaceandImplentation.RulesClass.SmartHomeAppliance;

public class SmartRefrigerator implements SmartHomeAppliance {
    @Override
    public void activate() {
        System.out.println("Smart refrigerator activated.");
    }

    @Override
    public void performTask() {
        System.out.println("Smart refrigerator cooling and monitoring inventory.");
    }

    @Override
    public void deactivate() {
        System.out.println("Smart refrigerator deactivated.");
    }
}