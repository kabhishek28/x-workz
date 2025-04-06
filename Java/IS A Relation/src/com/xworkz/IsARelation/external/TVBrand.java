package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.TV;

public class TVBrand extends TV {

    public TVBrand(){

        System.out.println("no arguments of TVBrand class");
    }

@Override
    public void watch(){
        System.out.println("@Override :watch method is running from TV class");
    }
    @Override
    public void change(){
        System.out.println("@Override :change method is running from TV class");
    }
    @Override
    public void on(){
        System.out.println("@Override :on method is running from TV class");
    }
    @Override
    public void volume(){
        System.out.println("@Override :volume method is running from TV class");
    }
    @Override
    public void off(){
        System.out.println("@Override :off method is running from TV class");
    }

}
