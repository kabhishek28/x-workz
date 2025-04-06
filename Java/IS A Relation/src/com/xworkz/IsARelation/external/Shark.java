package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Fish;

public class Shark extends Fish {

    public Shark() {
        System.out.println("No-argument constructor: Shark");
    }

@Override
    public void swim() {
        System.out.println("@Override :Fish is swimming...");
    }
    @Override
    public void breatheUnderwater() {
        System.out.println("@Override :Fish is breathing underwater...");
    }
    @Override
    public void layEggs() {
        System.out.println("@Override :Fish is laying eggs...");
    }
    @Override
    public void detectVibrations() {
        System.out.println("@Override :Fish is detecting vibrations in the water...");
    }
    @Override
    public void changeDepth() {
        System.out.println("@Override :Fish is adjusting its depth...");
    }
}
