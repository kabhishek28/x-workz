package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Fruit;
import com.xworkz.IsARelation.internal.TropicalFruit;

public class Pinapple extends TropicalFruit {
    public Pinapple(){
        System.out.println("no args const of Pinaaple");
    }

@Override
    public void growInWarmClimate() {
        System.out.println("@Override :Growing in a warm tropical climate...");
    }
    @Override
    public void absorbSunlight() {
        System.out.println("@Override :Absorbing plenty of sunlight...");
    }
    @Override
    public void provideVitamins() {
        System.out.println("@Override :Providing essential vitamins...");
    }
    @Override
    public void ripenQuickly() {
        System.out.println("@Override :Ripening quickly in tropical weather...");
    }
    @Override
    public void attractWildlife() {
        System.out.println("@Override :Attracting wildlife with sweet aroma...");
    }
}
