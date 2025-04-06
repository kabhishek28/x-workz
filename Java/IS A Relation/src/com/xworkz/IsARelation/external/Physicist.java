package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Scientist;

public class Physicist extends Scientist {
    public Physicist() {
        System.out.println("Physicist Constructor");
    }
@Override
    public void research() {
        System.out.println("@Override :Scientist is researching");
    }
    @Override
    public void experiment() {
        System.out.println("@Override :Scientist is conducting experiments");
    }
    @Override
    public void publish() {
        System.out.println("@Override :Scientist is publishing research");
    }
    @Override
    public void analyzeData() {
        System.out.println("@Override :Scientist is analyzing data");
    }
    @Override
    public void collaborate() {
        System.out.println("@Override :Scientist is collaborating with peers");
    }
}
