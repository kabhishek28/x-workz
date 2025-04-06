package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Train;

public class BulletTrain extends Train {
    public BulletTrain() {
        System.out.println("BulletTrain Constructor");
    }

@Override
    public void startJourney() {
        System.out.println("@Override :Train is starting its journey");
    }
    @Override
    public void stopAtStation() {
        System.out.println("@Override :Train is stopping at a station");
    }
    @Override
    public void increaseSpeed() {
        System.out.println("@Override :Train is increasing speed");
    }
    @Override
    public void blowHorn() {
        System.out.println("@Override :Train is blowing its horn");
    }
    @Override
    public void providePassengerService() {
        System.out.println("@Override :Train is providing service to passengers");
    }
}