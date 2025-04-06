package com.xworkz.IsARelation.external;


import com.xworkz.IsARelation.internal.TwoWheeler;

public class Bike extends TwoWheeler {
    public Bike (){
        System.out.println("zero argument const of the Bike ");
    }
    @Override
    public void balance() {
        System.out.println("@Override :Balancing on two wheels...");
    }
    @Override
    public void start() {
        System.out.println("@Override :Two-wheeler is starting...");
    }
    @Override
    public void stop() {
        System.out.println(" @Override :Two-wheeler is stopping...");
    }
    @Override
    public void accelerate() {
        System.out.println("@Override :Two-wheeler is accelerating...");
    }
    @Override
    public void applyBrakes() {
        System.out.println(" @Override :Brakes applied on two-wheeler...");
    }
}
