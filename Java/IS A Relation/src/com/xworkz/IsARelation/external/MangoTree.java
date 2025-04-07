package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Tree;

public class MangoTree extends Tree {

    public MangoTree() {
        System.out.println("No-argument constructor: Mango Tree");
    }

@Override
    public void grow() {
        System.out.println("@Override :Tree is growing...");
    }
    @Override
    public void photosynthesize() {
        System.out.println("@Override :Tree is performing photosynthesis...");
    }
    @Override
    public void absorbWater() {
        System.out.println("@Override :Tree is absorbing water...");
    }
    @Override
    public void provideOxygen() {
        System.out.println("@Override :Tree is providing oxygen...");
    }
    @Override
    public void shedLeaves() {
        System.out.println("@Override :Tree is shedding leaves...");
    }

    public void bearFruit() {
        System.out.println("Mango tree is bearing sweet mangoes!");
    }

}
