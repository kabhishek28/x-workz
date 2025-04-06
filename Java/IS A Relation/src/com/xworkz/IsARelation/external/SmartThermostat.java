package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.SmartHomeDevice;

public class SmartThermostat extends SmartHomeDevice {

    public SmartThermostat() {
        System.out.println("No-argument constructor: Smart Thermostat");
    }

@Override
    public void connectToWiFi() {
        System.out.println("@Override :Smart Home Device is connecting to WiFi...");
    }
    @Override
    public void receiveCommands() {
        System.out.println("@Override :Smart Home Device is receiving voice commands...");
    }
    @Override
    public void controlTemperature() {
        System.out.println("@Override :Smart Home Device is adjusting temperature...");
    }
    @Override
    public void trackEnergyUsage() {
        System.out.println("@Override :Smart Home Device is tracking energy usage...");
    }
    @Override
    public void scheduleAutomation() {
        System.out.println("@Override :Smart Home Device is scheduling automation tasks...");
    }

}