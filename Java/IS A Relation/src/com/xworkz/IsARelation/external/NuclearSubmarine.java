package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Submarine;

public class NuclearSubmarine extends Submarine {
    public NuclearSubmarine() {
        System.out.println("No-argument constructor: NuclearSubmarine");
    }

@Override
    public void dive() {
        System.out.println("@Override :Submarine is diving underwater");
    }
    @Override
    public void surface() {
        System.out.println("@Override :Submarine is surfacing");
    }
    @Override
    public void navigate() {
        System.out.println("@Override :Submarine is navigating");
    }
    @Override
    public void sonarScan() {
        System.out.println("@Override :Submarine is scanning using sonar");
    }
    @Override
    public void fireTorpedo() {
        System.out.println("@Override :Submarine is firing a torpedo");
    }
}
