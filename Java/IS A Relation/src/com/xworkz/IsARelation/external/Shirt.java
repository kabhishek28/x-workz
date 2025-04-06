package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Cloth;

public class Shirt extends Cloth {
    public Shirt(){
        System.out.println("Shirt no argument");
    }
@Override
    public void brand(){
        System.out.println("@Override :brand cloth");
    }
    @Override
    public void size(){
        System.out.println("@Override :size cloth");
    }
    @Override
    public void price(){
        System.out.println("@Override :price cloth");
    }
    @Override
    public void quality(){
        System.out.println("@Override :quality cloth");
    }
    @Override
    public void quantity(){
        System.out.println("@Override :quantity cloth");
    }
}
