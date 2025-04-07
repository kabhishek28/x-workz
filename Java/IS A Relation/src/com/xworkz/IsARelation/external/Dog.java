package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Animal;

public class Dog extends Animal {
    public Dog(){
        System.out.println("NO Dog");
    }
@Override
    public void running(){
        System.out.println("@Override :Running ");
    }
    @Override
    public void name(){
        System.out.println("@Override :name");
    }
    @Override
    public void walk(){
        System.out.println("@Override :walk");
    }
    @Override
    public void fly(){
        System.out.println("@Override :fly");
    }
    @Override
    public void sleep(){
        System.out.println("@Override :sleep");
    }
    public void bark() {
        System.out.println("Dog is barking...");
    }

}
