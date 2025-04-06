package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Menu;

public class Food extends Menu {
    public Food(){
        System.out.println("no argument const of food");
    }
@Override
    public void open(){
        System.out.println("@Override :open method from Menu class is running ");
    }
    @Override
    public void veg(){
        System.out.println("@Override :veg method from Menu class is running ");
    }
    @Override
    public void nonVeg(){
        System.out.println("@Override :nonVeg method from Menu class is running ");
    }
    @Override
    public void thali(){
        System.out.println("@Override :thali method from Menu class is running ");
    }
    @Override
    public void drinks(){
        System.out.println("@Override :drinks method from Menu class is running ");
    }

}
