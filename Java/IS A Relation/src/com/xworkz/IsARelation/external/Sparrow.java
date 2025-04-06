package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Bird;

public class Sparrow extends Bird {
    public Sparrow() {
        System.out.println("No-argument constructor: Sparrow");
    }
@Override
    public void fly() {
        System.out.println("@Override :Bird can fly");
    }
    @Override
    public void sing() {
        System.out.println("@Override :Bird is singing");
    }
    @Override
    public void eat() {
        System.out.println("@Override :Bird is eating");
    }
    @Override
    public void sleep() {
        System.out.println("@Override :Bird is sleeping");
    }
    @Override
    public void nest() {
        System.out.println("@Override :Bird builds a nest");
    }
}
