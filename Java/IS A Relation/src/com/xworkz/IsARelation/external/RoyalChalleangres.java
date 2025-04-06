package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Ahcohol;

public class RoyalChalleangres extends Ahcohol {
    public RoyalChalleangres(){
        System.out.println("zero arguments");
    }
@Override
    public void brand(){
        System.out.println("@Override :brand Ahcohol");
    }
    @Override
    public void price(){
        System.out.println("@Override :price Ahcohol");
    }
    @Override
    public void quantity(){
        System.out.println("@Override :quantity Ahcohol");
    }
    @Override
    public void percentage(){
        System.out.println("@Override :percentage Ahcohol");
    }
    @Override
    public void size(){
        System.out.println("@Override :size Ahcohol");
    }

}
