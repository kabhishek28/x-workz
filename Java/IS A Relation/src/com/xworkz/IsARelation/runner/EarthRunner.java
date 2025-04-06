package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Earth;
import com.xworkz.IsARelation.internal.Planet;

public class EarthRunner {
    public static void main(String[] args) {

        Planet planet1 = new Planet();
        planet1.revolveAroundSun();
        planet1.rotateOnAxis();
        planet1.haveAtmosphere();
        planet1.supportLife();
        planet1.haveMoons();

        System.out.println("--------------");
        Planet planet = new Earth();


        planet.revolveAroundSun();
        planet.rotateOnAxis();
        planet.haveAtmosphere();
        planet.supportLife();
        planet.haveMoons();

        System.out.println("--------------");

        Earth earth = new Earth();
        earth.revolveAroundSun();
        earth.rotateOnAxis();
        earth.haveAtmosphere();
        earth.supportLife();
        earth.haveMoons();
    }
}
