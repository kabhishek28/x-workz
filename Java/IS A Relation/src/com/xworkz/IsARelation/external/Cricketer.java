package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Athlete;

public class Cricketer extends Athlete {

    public Cricketer() {
        System.out.println("No-argument constructor: Cricketer");
    }

@Override
    public void train() {
        System.out.println("@Override :Athlete is training...");
    }
    @Override
    public void compete() {
        System.out.println("@Override :Athlete is competing...");
    }
    @Override
    public void followDiet() {
        System.out.println("@Override :Athlete is following a strict diet...");
    }
    @Override
    public void recover() {
        System.out.println("@Override :Athlete is recovering from training...");
    }
    @Override
    public void setGoals() {
        System.out.println("@Override :Athlete is setting goals...");
    }
}
