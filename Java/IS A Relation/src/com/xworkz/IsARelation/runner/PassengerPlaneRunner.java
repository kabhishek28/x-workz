package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.PassengerPlane;
import com.xworkz.IsARelation.internal.Aircraft;

public class PassengerPlaneRunner {
    public static void main(String[] args) {
        Aircraft aircraft1 = new Aircraft();
        aircraft1.takeOff();
        aircraft1.fly();
        aircraft1.communicateWithATC();
        aircraft1.refuel();
        aircraft1.land();

        System.out.println("---------------");
        Aircraft aircraft = new PassengerPlane();
        aircraft.takeOff();
        aircraft.fly();
        aircraft.communicateWithATC();
        aircraft.refuel();
        aircraft.land();

        System.out.println("---------------");

        PassengerPlane passengerPlane = new PassengerPlane();
        passengerPlane.takeOff();
        passengerPlane.fly();
        passengerPlane.communicateWithATC();
        passengerPlane.refuel();
        passengerPlane.land();
    }
}
