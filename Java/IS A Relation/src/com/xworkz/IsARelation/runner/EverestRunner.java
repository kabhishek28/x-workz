package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Everest;
import com.xworkz.IsARelation.internal.Mountain;

public class EverestRunner {
    public static void main(String[] args) {
        Mountain mountain = new Everest();
        mountain.rise();
        mountain.erode();
        mountain.provideHabitat();
        mountain.regulateClimate();
        mountain.storeGlaciers();
    }
}
