package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.AutoMobile;
import com.xworkz.IsARelation.internal.FourWheeler;

public class Car extends FourWheeler {
    public Car(){
        System.out.println("zero parameter const of Car");
    }
@Override
    public void startEngine() {
        System.out.println("@Override :Engine started for the four-wheeler.");
    }
    @Override
    public void stopEngine() {
        System.out.println("@Override :Engine stopped for the four-wheeler.");
    }
    @Override
    public void turnLeft() {
        System.out.println("@Override :Four-wheeler turning left.");
    }
    @Override
    public void turnRight() {
        System.out.println("@Override :Four-wheeler turning right.");
    }
    @Override
    public void applyBrakes() {
        System.out.println("@Override :Brakes applied on the four-wheeler.");
    }

    public void riseSpeed(){
        System.out.println("rise the speed of the car");
    }


}
