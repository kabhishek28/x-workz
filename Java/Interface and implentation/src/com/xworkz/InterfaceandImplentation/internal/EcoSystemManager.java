package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.PollutionControl;

public class EcoSystemManager implements PollutionControl {
    @Override
    public void monitorAirQuality() {
        System.out.println("Monitoring air quality in the urban area.");
    }

    @Override
    public void reduceEmissions() {
        System.out.println("Implementing measures to reduce emissions.");
    }

    @Override
    public void reportStatus() {
        System.out.println("Reporting current pollution status.");
    }
}