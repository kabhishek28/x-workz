package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Fruit;

public class Orange extends Fruit {
    public Orange(){
        System.out.println("Zero parameter const");
    }

@Override
    public void quantity(){
        System.out.println("@Override :quantity method of  Fruit");
    }

    @Override
    public void quality(){
        System.out.println("@Override :quality method of  Fruit");
    }
    @Override
    public void kg(){

        System.out.println("@Override :kg method of  Fruit");
    }
    @Override
    public void sweet(){
        System.out.println("@Override :quality method of  Fruit");
    }
}
