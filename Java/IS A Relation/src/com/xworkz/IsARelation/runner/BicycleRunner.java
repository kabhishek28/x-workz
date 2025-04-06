package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Bicycle;
import com.xworkz.IsARelation.internal.AutoMobile;

public class BicycleRunner {
    public static void main(String[] args) {
        AutoMobile autoMobile = new AutoMobile();
        autoMobile.applyBreak();
        autoMobile.Speed();
        autoMobile.start();
        autoMobile.Stop();
        autoMobile.topSpeed();
        System.out.println("*-*-----------------------");
        AutoMobile autoMobile1 = new Bicycle();
        autoMobile1.applyBreak();
        autoMobile1.Speed();
        autoMobile1.start();
        autoMobile1.Stop();
        autoMobile1.topSpeed();
        System.out.println("--------------");
        Bicycle bicycle = new Bicycle();
        bicycle.applyBreak();
        bicycle.Speed();
        bicycle.start();
        bicycle.Stop();
        bicycle.topSpeed();

    }
}
