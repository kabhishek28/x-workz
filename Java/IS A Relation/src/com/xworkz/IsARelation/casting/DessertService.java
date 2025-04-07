package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.CupCake;
import com.xworkz.IsARelation.internal.Dessert;

public class DessertService {



        public DessertService() {
            System.out.println("DessertService constructor is running");
        }

        public void getDessertDetails(Dessert dessert) {
            if (dessert != null) {
                dessert.serve();
                dessert.addToppings();
                dessert.chill();
                dessert.describeTaste();
                dessert.displayCalories();

                if (dessert instanceof CupCake) {
                    CupCake cupCake = (CupCake) dessert;
                    cupCake.showFrostingStyle();
                } else {
                    System.out.println("dessert is not an instance of CupCake");
                }
            }
        }


}
