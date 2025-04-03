package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Shirt;
import com.xworkz.IsARelation.internal.Cloth;

public class ShirtRunner {
    public static void main(String[] args) {
        Cloth cloth = new Shirt();
        cloth.brand();
        cloth.quality();
        cloth.price();
        cloth.quantity();
        cloth.size();
        System.out.println("-----------------");
        Shirt shirt = new Shirt();
        shirt.brand();
        shirt.price();
        shirt.size();
        shirt.quality();
        shirt.quantity();

    }
}
