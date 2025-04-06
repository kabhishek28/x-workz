package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.SurveillanceDrone;
import com.xworkz.IsARelation.internal.Drone;

public class DroneRunner {
    public static void main(String[] args) {
        Drone drone1 = new Drone();
        drone1.takeOff();
        drone1.land();
        drone1.hover();
        drone1.captureVideo();
        drone1.batteryStatus();

        System.out.println("******************");
        Drone drone = new SurveillanceDrone();
        drone.takeOff();
        drone.land();
        drone.hover();
        drone.captureVideo();
        drone.batteryStatus();

        System.out.println("******************");

        SurveillanceDrone surveillance = new SurveillanceDrone();
        surveillance.takeOff();
        surveillance.land();
        surveillance.hover();
        surveillance.captureVideo();
        surveillance.batteryStatus();
    }
}
