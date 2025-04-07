package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Bike;
import com.xworkz.IsARelation.internal.TwoWheeler;

public class TwoWheelerShowRoom {

    public TwoWheelerShowRoom(){
        System.out.println("TwoWheelerShowRoom const");
    }

    public void getTwoWheeler(TwoWheeler twoWheeler){
        if(twoWheeler != null){
            twoWheeler.balance();
            twoWheeler.start();
            twoWheeler.stop();
            twoWheeler.accelerate();
            twoWheeler.applyBrakes();
            if(twoWheeler instanceof Bike){
                Bike bike = (Bike) twoWheeler;
                bike.topSpeed();
            } else{
                System.out.println("twoWheeler is not instances of bike");
            }

        }else {
            System.out.println("twoWheeler is NULL");
        }

    }
}
