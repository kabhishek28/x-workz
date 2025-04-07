package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Food;
import com.xworkz.IsARelation.internal.Menu;

public class MenuUtil {
        public MenuUtil() {
            System.out.println("MenuUtil Constructor");
        }

        public void getMenuDetails(Menu menu) {
            if (menu != null) {
                menu.open();
                menu.veg();
                menu.nonVeg();
                menu.thali();
                menu.drinks();

                if (menu instanceof Food) {
                    Food food = (Food) menu;
                    food.showDessertMenu();
                } else {
                    System.out.println("menu is not an instance of Food");
                }

                System.out.println("----- Menu Behavior Displayed -----");
            } else {
                System.out.println("Menu object is null");
            }
        }


}
