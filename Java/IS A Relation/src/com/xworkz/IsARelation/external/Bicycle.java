package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.AutoMobile;

public class Bicycle extends AutoMobile {

    public Bicycle(){
        System.out.println("zero parameter const of Bicycle");
    }

@Override
    public void start(){
        System.out.println("@Override :start method is running from Automobile class");
    }
    @Override
    public void Stop(){
        System.out.println("@Override :stop method is running from AutoMobile class");
    }
    @Override
    public void Speed(){
        System.out.println("@Override :Speed method is running form the AutoMobile class");
    }
    @Override
    public void applyBreak(){
        System.out.println("@Override :break method is running from the Automobile class");
    }
    @Override
    public void topSpeed(){
        System.out.println("@Override :Top Speed is running from the AutoMobile class");
    }

}
