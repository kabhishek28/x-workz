package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.House;
import com.xworkz.IsARelation.internal.Building;

public class BuildingUtil {


        public BuildingUtil() {
            System.out.println("BuildingUtil Constructor");
        }

        public void getBuildingDetails(Building building) {
            if (building != null) {
                building.type();
                building.price();
                building.floor();
                building.size();
                building.area();

                if (building instanceof House) {
                    House house = (House) building;
                    house.showOwnerName();
                } else {
                    System.out.println("building is not an instance of House");
                }

                System.out.println("----- Building Behavior Displayed -----");
            } else {
                System.out.println("Building object is null");
            }
        }


}
