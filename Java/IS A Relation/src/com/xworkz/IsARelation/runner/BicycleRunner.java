package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.applyBreak();
        bicycle.Speed();
        bicycle.start();
        bicycle.Stop();

    }
}
