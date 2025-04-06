package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Satellite;
import com.xworkz.IsARelation.internal.Spacecraft;

public class SatelliteRunner {
    public static void main(String[] args) {
        Spacecraft spacecraft1 = new Spacecraft();
        spacecraft1.launch();
        spacecraft1.orbit();
        spacecraft1.land();
        spacecraft1.communicate();
        spacecraft1.fuelType();

        System.out.println("******************");
        Spacecraft spacecraft = new Satellite();
        spacecraft.launch();
        spacecraft.orbit();
        spacecraft.land();
        spacecraft.communicate();
        spacecraft.fuelType();

        System.out.println("******************");

        Satellite satellite = new Satellite();
        satellite.launch();
        satellite.orbit();
        satellite.land();
        satellite.communicate();
        satellite.fuelType();
    }
}
