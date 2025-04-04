package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.NuclearSubmarine;
import com.xworkz.IsARelation.internal.Submarine;

public class SubmarineRunner {
    public static void main(String[] args) {
        Submarine submarine = new NuclearSubmarine();
        submarine.dive();
        submarine.surface();
        submarine.navigate();
        submarine.sonarScan();
        submarine.fireTorpedo();

        System.out.println("******************");

        NuclearSubmarine nuclearSub = new NuclearSubmarine();
        nuclearSub.dive();
        nuclearSub.surface();
        nuclearSub.navigate();
        nuclearSub.sonarScan();
        nuclearSub.fireTorpedo();
    }
}
