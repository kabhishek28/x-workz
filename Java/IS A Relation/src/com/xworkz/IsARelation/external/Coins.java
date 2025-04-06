package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Carrom;

public class Coins extends Carrom {
    public Coins(){
        System.out.println("on paramater");
    }
    @Override
    public void coins(){
        System.out.println("@Override :coins carrom");
    }
    @Override
    public void noOfcoins(){
        System.out.println("@Override :noOF coins");
    }
    @Override
    public void play(){
        System.out.println("@Override :paly carrom");
    }
    @Override
    public void end(){
        System.out.println("@Override :end Carrom");
    }
    @Override
    public void display(){
        System.out.println("@Override :display Carrom");
    }
}
