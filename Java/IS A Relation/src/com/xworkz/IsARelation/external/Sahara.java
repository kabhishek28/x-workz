package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Desert;

public class Sahara extends Desert {
    public Sahara() {
        System.out.println("Sahara Constructor");
    }

@Override
    public void storeHeat() {
        System.out.println("@Override :Desert stores heat during the day");
    }
    @Override
    public void coolAtNight() {
        System.out.println("@Override :Desert cools down at night");
    }
    @Override
    public void supportDroughtPlants() {
        System.out.println("@Override :Desert supports drought-resistant plants");
    }
    @Override
    public void experienceSandstorms() {
        System.out.println("@Override :Desert experiences sandstorms");
    }
    @Override
    public void haveOasis() {
        System.out.println("@Override :Desert contains oases for water");
    }
}