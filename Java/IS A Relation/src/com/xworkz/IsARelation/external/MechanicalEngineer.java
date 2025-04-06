package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Engineer;

public class MechanicalEngineer extends Engineer {
    public MechanicalEngineer() {
        System.out.println("Mechanical Engineer Constructor");
    }

@Override
    public void design() {
        System.out.println("@Override :Engineer is designing");
    }
    @Override
    public void analyze() {
        System.out.println("@Override :Engineer is analyzing systems");
    }
    @Override
    public void develop() {
        System.out.println("@Override :Engineer is developing a prototype");
    }
    @Override
    public void test() {
        System.out.println("@Override :Engineer is testing the design");
    }
    @Override
    public void optimize() {
        System.out.println("@Override :Engineer is optimizing the process");
    }
}
