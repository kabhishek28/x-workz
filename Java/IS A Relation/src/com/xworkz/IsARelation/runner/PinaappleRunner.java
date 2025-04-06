package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Pinapple;
import com.xworkz.IsARelation.internal.TropicalFruit;

public class PinaappleRunner {
    public static void main(String[] args) {
        TropicalFruit tropicalFruit = new TropicalFruit();
        tropicalFruit.absorbSunlight();
        tropicalFruit.attractWildlife();
        tropicalFruit.growInWarmClimate();
        tropicalFruit.provideVitamins();
        tropicalFruit.ripenQuickly();
        System.out.println("-------------------");
        TropicalFruit tropicalFruit1 = new Pinapple();
        tropicalFruit1.absorbSunlight();
        tropicalFruit1.attractWildlife();
        tropicalFruit1.growInWarmClimate();
        tropicalFruit1.provideVitamins();
        tropicalFruit1.ripenQuickly();
        System.out.println("---------------------");
        Pinapple pinapple = new Pinapple();
        pinapple.absorbSunlight();
        pinapple.attractWildlife();
        pinapple.growInWarmClimate();
        pinapple.provideVitamins();
        pinapple.ripenQuickly();

    }
}
