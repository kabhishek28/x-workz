package com.xworkz.InterfaceandImplentation.internal;


import com.xworkz.InterfaceandImplentation.RulesClass.Drone;

public class Quadcopter implements Drone {
        @Override
        public void takeOff() {
            System.out.println("Quadcopter taking off.");
        }

        @Override
        public void captureVideo() {
            System.out.println("Quadcopter capturing aerial video.");
        }

        @Override
        public void land() {
            System.out.println("Quadcopter landing safely.");
        }

}
