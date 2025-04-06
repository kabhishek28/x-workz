package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Orange;
import com.xworkz.IsARelation.internal.Fruit;

public class OrangeRunner {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.kg();
        fruit.Fruit();
        fruit.quality();
        fruit.sweet();
        fruit.quantity();
        System.out.println("---------------------");
        Fruit fruit1 = new Orange();
        fruit1.kg();
        fruit1.Fruit();
        fruit1.quality();
        fruit1.sweet();
        fruit1.quantity();
        System.out.println("----------------");
        Orange orange = new Orange();
        orange.kg();
        orange.Fruit();
        orange.quality();
        orange.sweet();
        orange.quantity();
    }
}
