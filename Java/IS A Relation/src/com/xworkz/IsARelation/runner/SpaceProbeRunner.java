package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.MarsRover;
import com.xworkz.IsARelation.internal.SpaceProbe;

public class SpaceProbeRunner {
    public static void main(String[] args) {
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
