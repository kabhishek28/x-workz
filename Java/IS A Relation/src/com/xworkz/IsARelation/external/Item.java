package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Shop;

public class Item extends Shop {

    public Item(){
        System.out.println("item const of the class item");
    }
@Override
    public void name(){
        System.out.println("@Override :shop name is running of the class shop");
    }
    @Override
    public void add(){
        System.out.println("@Override :add is running if class shop");
    }
    @Override
    public void item(){
        System.out.println("@Override :item is  running of the class item");
    }
    public void generateReceipt() {
        System.out.println("Generating receipt for the item...");
    }

}
