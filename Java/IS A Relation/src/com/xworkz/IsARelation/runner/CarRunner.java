package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Car;
import com.xworkz.IsARelation.internal.FourWheeler;

public class CarRunner {
    public static void main(String[] args) {
        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.startEngine();
        fourWheeler.applyBrakes();
        fourWheeler.turnLeft();
        fourWheeler.turnRight();
        fourWheeler.stopEngine();
        System.out.println("------------------");
        FourWheeler fourWheeler1 = new Car();
        fourWheeler1.startEngine();
        fourWheeler1.applyBrakes();
        fourWheeler1.turnLeft();
        fourWheeler1.turnRight();
        fourWheeler1.stopEngine();
        System.out.println("--------------------");

        Car car = new Car();
        car.startEngine();
        car.applyBrakes();
        car.turnLeft();
        car.turnRight();
        car.stopEngine();



    }
}
