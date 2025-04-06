package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Insect;

public class Butterfly extends Insect {

    public Butterfly() {
        System.out.println("No-argument constructor: Butterfly");
    }

    @Override
    public void fly() {
        System.out.println("@Override :Insect is flying...");
    }
    @Override
    public void metamorphosis() {
        System.out.println("@Override :Insect undergoes metamorphosis...");
    }
    @Override
    public void feedOnNectar() {
        System.out.println("@Override :Insect is feeding on nectar...");
    }
    @Override
    public void detectVibrations() {
        System.out.println("@Override :Insect is detecting vibrations...");
    }
    @Override
    public void communicateWithPheromones() {
        System.out.println("@Override: Insect is communicating using pheromones...");
    }
}