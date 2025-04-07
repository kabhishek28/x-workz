package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Bakery;

public class Cake extends Bakery {
    public Cake(){
        System.out.println("no argument const of Cake");
    }
@Override
    public void order(){
        System.out.println("@Override start method is running from Bakery class");
    }
    @Override
    public void open(){
        System.out.println("@Override :stop method is running from Bakery class");
    }
    @Override
    public void close(){
        System.out.println("@Override :Speed method is running form the Bakery class");
    }
    @Override
    public void bills(){
        System.out.println("@Override :break method is running from the Bakery class");
    }
    @Override
    public void offer(){
        System.out.println("@Override :Top Speed is running from the Bakery class");
    }

    public void kg(){
        System.out.println("how munah KG cake");
    }

}
