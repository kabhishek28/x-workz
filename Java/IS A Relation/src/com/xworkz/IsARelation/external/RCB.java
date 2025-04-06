package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.IPL;

public class RCB extends IPL {
    public RCB(){
        System.out.println("no parameter");
    }
@Override
    public void team(){
        System.out.println("@Override :team IPL");
    }
    @Override
    public void brand(){
        System.out.println("@Override :brand IPL");
    }
    @Override
    public void player(){
        System.out.println("@Override :player IPL");
    }
    @Override
    public void cup(){
        System.out.println("@Override :cup IPL");
    }
    @Override
    public void sponsor(){
        System.out.println("@Override :sponsor IPL");
    }

}
