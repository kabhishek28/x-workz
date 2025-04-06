package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Amphibian;

public class Frog extends Amphibian {
    public Frog() {
        System.out.println("No-argument constructor: Frog");
    }
@Override
    public void swim() {
        System.out.println("@Override :Amphibian is swimming...");
    }
    @Override
    public void jump() {
        System.out.println("@Override :Amphibian is jumping...");
    }
    @Override
    public void breatheThroughSkin() {
        System.out.println("@Override :Amphibian is breathing through its skin...");
    }
    @Override
    public void layEggsInWater() {
        System.out.println("@Override :Amphibian is laying eggs in water...");
    }
    @Override
    public void transitionToLand() {
        System.out.println("@Override :Amphibian is transitioning from water to land...");
    }
}