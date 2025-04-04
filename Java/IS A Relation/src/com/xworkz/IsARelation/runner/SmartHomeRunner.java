package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.SmartThermostat;
import com.xworkz.IsARelation.internal.SmartHomeDevice;

public class SmartHomeRunner {
    public static void main(String[] args) {
        SmartHomeDevice device = new SmartThermostat();
        device.connectToWiFi();
        device.receiveCommands();
        device.controlTemperature();
        device.trackEnergyUsage();
        device.scheduleAutomation();

        System.out.println("******************");

        SmartThermostat thermostat = new SmartThermostat();
        thermostat.connectToWiFi();
        thermostat.receiveCommands();
        thermostat.controlTemperature();
        thermostat.trackEnergyUsage();
        thermostat.scheduleAutomation();
    }
}
