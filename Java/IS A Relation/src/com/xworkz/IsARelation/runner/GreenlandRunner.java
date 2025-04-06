package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Greenland;
import com.xworkz.IsARelation.internal.Island;

public class GreenlandRunner {
    public static void main(String[] args) {

        Island island1 =new Island();
        island1.beSurroundedByWater();
        island1.haveBeaches();
        island1.supportMarineLife();
        island1.experienceTropicalClimate();
        island1.attractTourists();

        System.out.println("-----------");
        Island island = new Greenland();
        island.beSurroundedByWater();
        island.haveBeaches();
        island.supportMarineLife();
        island.experienceTropicalClimate();
        island.attractTourists();

        System.out.println("-----------");

        Greenland greenland = new Greenland();
        greenland.beSurroundedByWater();
        greenland.haveBeaches();
        greenland.supportMarineLife();
        greenland.experienceTropicalClimate();
        greenland.attractTourists();
    }
}
