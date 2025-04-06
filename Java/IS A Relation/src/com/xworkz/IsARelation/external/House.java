package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Building;

public class House extends Building {
    public House(){
        System.out.println("no arguments of Building");
    }

@Override
    public void type(){
        System.out.println("@Override :type of building is running");
    }
    @Override
    public void price(){
        System.out.println("@Override :price of building is running");
    }
    @Override
    public void floor(){
        System.out.println("@Override :floor of building is running");
    }
    @Override
    public void size(){
        System.out.println("@Override :size of building is running");
    }
    @Override
    public void area(){
        System.out.println("@Override :area of building is running");
    }
}
