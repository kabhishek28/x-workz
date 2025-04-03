package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Chair;
import com.xworkz.IsARelation.internal.Furniture;

public class ChairRunner {
    public static void main(String[] args) {
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
