package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.House;
import com.xworkz.IsARelation.internal.Building;

public class HouseRunner {
    public static void main(String[] args) {
        Building building1 = new Building();
        building1.type();
        building1.area();
        building1.floor();
        building1.floor();
        building1.price();

        System.out.println("--------------------");
        House house = new House();
        house.type();
        house.area();
        house.floor();
        house.floor();
        house.price();

        System.out.println("--------------------");
        Building building = new House();
        building.type();
        building.area();
        building.floor();
        building.floor();
        building.price();
    }
}
