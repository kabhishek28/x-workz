package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Bike;
import com.xworkz.IsARelation.internal.TwoWheeler;

public class BikeRunner {
    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.start();
        twoWheeler.accelerate();
        twoWheeler.applyBrakes();
        twoWheeler.balance();
        twoWheeler.stop();

        System.out.println("-------------");
        TwoWheeler twoWheeler1 = new Bike();
        twoWheeler1.start();
        twoWheeler1.accelerate();
        twoWheeler1.applyBrakes();
        twoWheeler1.balance();
        twoWheeler1.stop();

        System.out.println("-------------");
        Bike bike = new Bike();
        bike.start();
        bike.accelerate();
        bike.applyBrakes();
        bike.balance();
        bike.stop();





    }

}
