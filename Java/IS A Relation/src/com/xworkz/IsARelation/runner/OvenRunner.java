package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Oven;
import com.xworkz.IsARelation.internal.Device;

public class OvenRunner {

    public static void main(String[] args) {

        Device device1 = new Device();
        device1.powerOn();
        device1.powerOff();
        device1.batteryStatus();
        device1.connectivity();
        device1.deviceInfo();

        System.out.println("******************");
        Device device = new Oven();
        device.powerOn();
        device.powerOff();
        device.batteryStatus();
        device.connectivity();
        device.deviceInfo();

        System.out.println("******************");

        Oven smartphone = new Oven();
        smartphone.powerOn();
        smartphone.powerOff();
        smartphone.batteryStatus();
        smartphone.connectivity();
        smartphone.deviceInfo();
    }
}
