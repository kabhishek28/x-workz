package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.MarsRover;
import com.xworkz.IsARelation.internal.SpaceProbe;

public class SpaceProbeRunner {
    public static void main(String[] args) {

        SpaceProbe spaceProbe1 = new SpaceProbe();
        spaceProbe1.launch();
        spaceProbe1.collectData();
        spaceProbe1.sendSignal();
        spaceProbe1.analyzeSamples();
        spaceProbe1.navigate();

        System.out.println("******************");
        SpaceProbe probe = new MarsRover();
        probe.launch();
        probe.collectData();
        probe.sendSignal();
        probe.analyzeSamples();
        probe.navigate();

        System.out.println("******************");

        MarsRover rover = new MarsRover();
        rover.launch();
        rover.collectData();
        rover.sendSignal();
        rover.analyzeSamples();
        rover.navigate();
    }
}
