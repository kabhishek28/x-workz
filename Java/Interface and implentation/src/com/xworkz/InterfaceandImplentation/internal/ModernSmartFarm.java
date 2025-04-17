package com.xworkz.InterfaceandImplentation.internal;


import com.xworkz.InterfaceandImplentation.RulesClass.SmartFarm;

public class ModernSmartFarm implements SmartFarm {
    @Override
    public void monitorCrops() {
        System.out.println("SmartFarm monitoring crop growth.");
    }

    @Override
    public void automateIrrigation() {
        System.out.println("Automating irrigation based on weather data.");
    }

    @Override
    public void analyzeSoil() {
        System.out.println("Analyzing soil nutrients for optimal growth.");
    }
}