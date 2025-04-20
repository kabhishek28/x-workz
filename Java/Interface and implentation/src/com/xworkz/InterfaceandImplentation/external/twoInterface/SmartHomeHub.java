package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.SmartDevice;
import com.xworkz.InterfaceandImplentation.RulesClass.SmartHomeAppliance;


    public class SmartHomeHub implements SmartHomeAppliance, SmartDevice {
        @Override
        public void activate() {
            System.out.println("SmartHomeHub activating home network.");
        }

        @Override
        public void performTask() {
            System.out.println("SmartHomeHub performing scheduled tasks.");
        }

        @Override
        public void deactivate() {
            System.out.println("SmartHomeHub deactivating systems.");
        }

        @Override
        public void turnOn() {
            System.out.println("SmartHomeHub turning on devices.");
        }

        @Override
        public void operate() {
            System.out.println("SmartHomeHub operating connected appliances.");
        }

        @Override
        public void turnOff() {
            System.out.println("SmartHomeHub turning off devices.");
        }

}