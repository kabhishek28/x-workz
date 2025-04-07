package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Bakery;
import com.xworkz.IsARelation.internal.Dessert;

public class CupCake extends Dessert {
    public CupCake(){
        System.out.println("zero argument of the CupCake");
    }
@Override
    public void serve() {
        System.out.println("@Override :Serving the dessert...");
    }
    @Override
    public void addToppings() {
        System.out.println("@Override :Adding toppings to the dessert...");
    }
    @Override
    public void chill() {
        System.out.println("@Override :Chilling the dessert before serving...");
    }
    @Override
    public void describeTaste() {
        System.out.println("@Override :This dessert is sweet and delicious!");
    }
    @Override
    public void displayCalories() {
        System.out.println("@Override :This dessert has approximately 250 calories.");
    }

    public void showFrostingStyle() {
        System.out.println("CupCake has a swirl of chocolate frosting");
    }

}
