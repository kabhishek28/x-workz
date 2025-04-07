package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Island;

public class Greenland extends Island {
    public Greenland() {
        System.out.println("Greenland Constructor");
    }
@Override
    public void beSurroundedByWater() {
        System.out.println("@Override :Island is surrounded by water");
    }
    @Override
    public void haveBeaches() {
        System.out.println("@Override :Island has sandy beaches");
    }
    @Override
    public void supportMarineLife() {
        System.out.println("@Override :Island supports marine life");
    }
    @Override
    public void experienceTropicalClimate() {
        System.out.println("@Override :Island experiences a tropical climate");
    }
    @Override
    public void attractTourists() {
        System.out.println("@Override :Island attracts tourists");
    }
    public void displaySize() {
        System.out.println("Greenland is the world's largest island by area.");
    }

}