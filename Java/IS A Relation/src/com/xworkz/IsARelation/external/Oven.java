package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Device;

public class Oven extends Device {
    public Oven() {
        System.out.println("No-argument constructor: Smartphone");
    }

@Override
    public void powerOn() {
        System.out.println("@Override :Device is powered ON");
    }
    @Override
    public void powerOff() {
        System.out.println("@Override :Device is powered OFF");
    }
    @Override
    public void batteryStatus() {
        System.out.println("@Override :Battery status: 80%");
    }
    @Override
    public void connectivity() {
        System.out.println("@Override :Connectivity: Wi-Fi & Bluetooth");
    }
    @Override
    public void deviceInfo() {
        System.out.println("@Override :Device Information: Generic Device");
    }

}
