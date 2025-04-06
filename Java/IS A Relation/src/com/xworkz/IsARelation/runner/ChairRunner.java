package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Chair;
import com.xworkz.IsARelation.internal.Furniture;

public class ChairRunner {
    public static void main(String[] args) {
        Furniture furniture1 =new Furniture();
        furniture1.open();
        furniture1.material();
        furniture1.quality();
        furniture1.type();
        furniture1.price();
        System.out.println("---------------");

        Chair chair = new Chair();
        chair.open();
        chair.material();
        chair.quality();
        chair.type();
        chair.price();
        System.out.println("---------------");

        Furniture furniture = new Chair();
        furniture.open();
        furniture.material();
        furniture.quality();
        furniture.type();
        furniture.price();

    }
}
