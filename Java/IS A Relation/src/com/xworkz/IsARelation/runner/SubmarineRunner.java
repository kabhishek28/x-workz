package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.NuclearSubmarine;
import com.xworkz.IsARelation.internal.Submarine;

public class SubmarineRunner {
    public static void main(String[] args) {
        Submarine submarine1 = new Submarine();
        submarine1.dive();
        submarine1.surface();
        submarine1.navigate();
        submarine1.sonarScan();
        submarine1.fireTorpedo();

        System.out.println("******************");
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
