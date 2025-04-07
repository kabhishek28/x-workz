package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Amongus;
import com.xworkz.IsARelation.external.Apple;
import com.xworkz.IsARelation.internal.Fruit;

public class FruitMarket {
    public FruitMarket(){
        System.out.println("FruitMarket Const");
    }

    public void getFruit(Fruit fruit){
        if(fruit != null){
            fruit.quantity();
            fruit.quality();
            fruit.kg();
            fruit.sweet();
            if(fruit instanceof Apple){
                Apple apple =(Apple) fruit;
                apple.price();
            }else{
                System.out.println("fruit is not instance of apple");
            }

        }else {
            System.out.println("fruit is null");
        }
    }
}
