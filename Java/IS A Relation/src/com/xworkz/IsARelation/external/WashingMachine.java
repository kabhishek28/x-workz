package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Appliance;

public class WashingMachine extends Appliance {
    public WashingMachine() {
        System.out.println(" no arguments const of Washing Machine created");
    }

@Override
    public void turnOn() { System.out.println("@Override :Appliance is turned on"); }
    @Override
    public void turnOff() { System.out.println("@Override :Appliance is turned off"); }
    @Override
    public void function() { System.out.println("@Override :Appliance is functioning"); }
    @Override
    public void maintenance() { System.out.println("@Override :Appliance needs maintenance"); }
    @Override
    public void warranty() { System.out.println("@Override :Checking warranty status"); }
}
