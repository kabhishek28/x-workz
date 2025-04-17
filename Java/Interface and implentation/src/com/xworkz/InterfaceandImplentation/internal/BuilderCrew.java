package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.ConstructionSite;

public class BuilderCrew implements ConstructionSite {
    @Override
    public void layFoundation() {
        System.out.println("Laying foundation.");
    }

    @Override
    public void buildStructure() {
        System.out.println("Building the structure.");
    }

    @Override
    public void paintWalls() {
        System.out.println("Painting the walls.");
    }
}
