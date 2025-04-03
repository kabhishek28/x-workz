package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Tractor;
import com.xworkz.IsARelation.internal.AutoMobile;

public class TractorRunner {
    public static void main(String[] args) {
        Tractor tractor = new Tractor();
        tractor.start();
        tractor.Stop();
        tractor.Speed();
        tractor.applyBreak();
        tractor.topSpeed();

        System.out.println("--------------------");

        AutoMobile autoMobile = new Tractor();
        autoMobile.start();
        autoMobile.Stop();
        autoMobile.Speed();
        autoMobile.applyBreak();
        autoMobile.topSpeed();
    }
}
