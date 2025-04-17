package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.SmartWatch;

public class AppleWatch implements SmartWatch {
    @Override
    public void displayTime() {
        System.out.println("Apple Watch displaying time.");
    }

    @Override
    public void monitorHeartRate() {
        System.out.println("Apple Watch monitoring heart rate.");
    }

    @Override
    public void runApps() {
        System.out.println("Apple Watch is running fitness apps.");
    }
}
