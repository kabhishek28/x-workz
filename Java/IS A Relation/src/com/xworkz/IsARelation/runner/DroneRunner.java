package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.SurveillanceDrone;
import com.xworkz.IsARelation.internal.Drone;

public class DroneRunner {
    public static void main(String[] args) {
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
