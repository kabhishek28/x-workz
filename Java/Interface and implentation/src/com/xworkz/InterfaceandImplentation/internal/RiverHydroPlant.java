package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.HydroPowerPlant;

public class RiverHydroPlant implements HydroPowerPlant {
    @Override
    public void startTurbine() {
        System.out.println("HydroPlant turbine started.");
    }

    @Override
    public void regulateFlow() {
        System.out.println("Regulating river water flow for optimal power.");
    }

    @Override
    public void shutdownPlant() {
        System.out.println("HydroPlant is shutting down safely.");
    }
}