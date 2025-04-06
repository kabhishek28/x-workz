package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Furniture;

public class Chair extends Furniture {
    public Chair(){
        System.out.println("no  arguments const of Chair");
    }

    @Override
    public void open(){
        System.out.println("@Override :open method from Furniture class is running ");
    }
    @Override
    public void material(){
        System.out.println("@Override :veg method from Furniture class is running ");
    }
    @Override
    public void type(){
        System.out.println("@Override :nonVeg method from Furniture class is running ");
    }
    @Override
    public void quality(){
        System.out.println("@Override :thali method from Furniture class is running ");
    }
    @Override
    public void price(){
        System.out.println("@Override :drinks method from Furniture class is running ");
    }

}
