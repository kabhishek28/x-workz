package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.SpaceProbe;

public class MarsRover extends SpaceProbe {

    public MarsRover() {
        System.out.println("No-argument constructor: Mars Rover");
    }

@Override
    public void launch() {
        System.out.println("@Override :Space Probe is launching");
    }
    @Override
    public void collectData() {
        System.out.println("@Override :Space Probe is collecting space data");
    }
    @Override
    public void sendSignal() {
        System.out.println("@Override :Space Probe is sending a signal to Earth");
    }
    @Override
    public void analyzeSamples() {
        System.out.println("@Override :Space Probe is analyzing samples");
    }
    @Override
    public void navigate() {
        System.out.println("@Override :Space Probe is navigating through space");
    }
}
