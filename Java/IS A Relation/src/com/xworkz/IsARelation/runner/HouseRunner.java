package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.House;
import com.xworkz.IsARelation.internal.Building;

public class HouseRunner {
    public static void main(String[] args) {
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
