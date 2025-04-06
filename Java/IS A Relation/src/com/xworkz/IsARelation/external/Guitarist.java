package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Musician;

public class Guitarist extends Musician {

    public Guitarist() {
        System.out.println("No-argument constructor: Guitarist");
    }
@Override
    public void playInstrument() {
        System.out.println("@Override Musician is playing an instrument...");
    }
    @Override
    public void composeMusic() {
        System.out.println("@Override :Musician is composing music...");
    }
    @Override
    public void performOnStage() {
        System.out.println("@Override :Musician is performing on stage...");
    }
    @Override
    public void practice() {
        System.out.println("@Override :Musician is practicing...");
    }
    @Override
    public void collaborate() {
        System.out.println("@Override :Musician is collaborating with other artists...");
    }
}