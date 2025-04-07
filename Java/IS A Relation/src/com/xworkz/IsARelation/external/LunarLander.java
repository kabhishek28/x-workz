package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Spacecraft;

public class LunarLander extends Spacecraft {
    public LunarLander() {
        System.out.println("LunarLander Constructor");
    }
@Override
    public void launch() {
        System.out.println("@Override :Spacecraft is launching");
    }
    @Override
    public void orbit() {
        System.out.println("@Override :Spacecraft is in orbit");
    }
    @Override
    public void land() {
        System.out.println("@Override :Spacecraft is landing");
    }
    @Override
    public void communicate() {
        System.out.println("@Override :Spacecraft is communicating with ground control");
    }
    @Override
    public void fuelType() {
        System.out.println("@Override :Spacecraft uses rocket fuel");
    }

    public void collectMoonSamples() {
        System.out.println("LunarLander is collecting moon rock samples...");
    }

}