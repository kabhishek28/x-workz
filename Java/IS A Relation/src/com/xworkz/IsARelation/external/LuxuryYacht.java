package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Yacht;

public class LuxuryYacht extends Yacht {
    public LuxuryYacht() {
        System.out.println("LuxuryYacht Constructor");
    }

@Override
    public void sail() {
        System.out.println("@Override :Yacht is sailing");
    }
    @Override
    public void dock() {
        System.out.println("@Override :Yacht is docking at the marina");
    }
    @Override
    public void hostParty() {
        System.out.println("@Override :Yacht is hosting a party");
    }
    @Override
    public void navigate() {
        System.out.println("@Override :Yacht is navigating the sea");
    }
    @Override
    public void provideLuxuryExperience() {
        System.out.println("@Override :Yacht is providing a luxury experience");
    }
}