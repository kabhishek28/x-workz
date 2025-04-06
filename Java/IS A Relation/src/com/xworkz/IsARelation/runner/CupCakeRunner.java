package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.CupCake;
import com.xworkz.IsARelation.internal.Dessert;

public class CupCakeRunner {
    public static void main(String[] args) {
        Dessert dessert = new Dessert();
        dessert.addToppings();
        dessert.chill();
        dessert.describeTaste();
        dessert.displayCalories();
        dessert.serve();
        System.out.println("------------------------------");
        Dessert dessert1 = new CupCake();
        dessert1.addToppings();
        dessert1.chill();
        dessert1.describeTaste();
        dessert1.displayCalories();
        dessert1.serve();
        System.out.println("------------");
        CupCake cupCake = new CupCake();
        cupCake.addToppings();
        cupCake.chill();
        cupCake.describeTaste();
        cupCake.displayCalories();
        cupCake.serve();

    }
}
