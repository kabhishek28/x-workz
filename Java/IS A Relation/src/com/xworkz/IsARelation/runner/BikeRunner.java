package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Bike;

public class BikeRunner {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.applyBreak();
        bike.Speed();
        bike.start();
        bike.Stop();

        bike.topSpeed();
    }

}
