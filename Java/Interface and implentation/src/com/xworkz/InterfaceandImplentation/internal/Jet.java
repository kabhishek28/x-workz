package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.AirCraft;

public class Jet implements AirCraft {
    @Override
    public void takeOff() {
        System.out.println("Jet is taking off.");
    }
    @Override
    public void land() {
        System.out.println("Jet is landing.");
    }
    @Override
    public void cruisingSpeed() {
        System.out.println("Jet is cruising at 900 km/h.");
    }
}