package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Apple;
import com.xworkz.IsARelation.internal.Fruit;

public class AppleRunner {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        fruit1.quality();
        fruit1.quantity();
        fruit1.kg();
        fruit1.sweet();
        System.out.println("---------------");
        Fruit fruit = new Apple();
        fruit.quality();
        fruit.quantity();
        fruit.kg();
        fruit.sweet();
        System.out.println("--------------");
        Apple apple =new Apple();
        apple.quantity();
        apple.quality();
        apple.kg();
        apple.sweet();



    }
}
