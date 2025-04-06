package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Everest;
import com.xworkz.IsARelation.internal.Mountain;

public class EverestRunner {
    public static void main(String[] args) {

        Mountain mountain1 = new Mountain();
        mountain1.rise();
        mountain1.erode();
        mountain1.provideHabitat();
        mountain1.regulateClimate();
        mountain1.storeGlaciers();
        System.out.println("-------------");
        Mountain mountain = new Everest();
        mountain.rise();
        mountain.erode();
        mountain.provideHabitat();
        mountain.regulateClimate();
        mountain.storeGlaciers();
        System.out.println("--------------");
        Everest everest = new Everest();
        everest.rise();
        everest.erode();
        everest.provideHabitat();
        everest.regulateClimate();
        everest.storeGlaciers();
        System.out.println("--------------");

    }
}
