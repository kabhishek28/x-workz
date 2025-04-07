package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Chair;
import com.xworkz.IsARelation.internal.Furniture;

public class FurnitureUtil {

        public FurnitureUtil() {
            System.out.println("FurnitureUtil constructor is running");
        }

        public void getFurniture(Furniture furniture) {
            if (furniture != null) {
                furniture.open();
                furniture.material();
                furniture.type();
                furniture.quality();
                furniture.price();

                if (furniture instanceof Chair) {
                    Chair chair = (Chair) furniture;
                    chair.noOfSeat();
                } else {
                    System.out.println("furniture is not an instance of Chair");
                }
            }
        }
    }


