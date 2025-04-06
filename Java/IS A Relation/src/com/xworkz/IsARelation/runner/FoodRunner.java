package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Food;
import com.xworkz.IsARelation.internal.Menu;

public class FoodRunner{
    public static void main(String[] args) {
        Menu menu1 = new Menu();
        menu1.open();
        menu1.veg();
        menu1.nonVeg();
        menu1.thali();
        menu1.drinks();

        System.out.println("---------------------");
        Food food = new Food();
        food.open();
        food.veg();
        food.nonVeg();
        food.thali();
        food.drinks();

        System.out.println("---------------------");

        Menu menu = new Food();
        menu.open();
        menu.veg();
        menu.nonVeg();
        menu.drinks();
        menu.thali();
    }
}
