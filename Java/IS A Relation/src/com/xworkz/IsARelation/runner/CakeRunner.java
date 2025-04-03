package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Cake;
import com.xworkz.IsARelation.internal.Bakery;

public class CakeRunner{
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.open();
        cake.order();
        cake.close();
        cake.bills();
        cake.offer();

        System.out.println("-------------------");

        Bakery bakery = new Cake();
        bakery.open();
        bakery.close();
        bakery.bills();
        bakery.offer();
        bakery.order();
    }
}
