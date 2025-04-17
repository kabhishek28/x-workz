package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.WindTurbine;

public class WindMillTurbine implements WindTurbine {
    @Override
    public void startTurbine() {
        System.out.println("Wind turbine starting up.");
    }

    @Override
    public void adjustBlades() {
        System.out.println("Adjusting the turbine blades for optimal performance.");
    }

    @Override
    public void shutdownTurbine() {
        System.out.println("Shutting down the wind turbine.");
    }
}