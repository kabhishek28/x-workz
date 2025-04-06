package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.SagarHotel;
import com.xworkz.IsARelation.internal.Restaurant;

public class SagarHotelRunner {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant();
        restaurant1.room();
        restaurant1.timing();
        restaurant1.open();
        restaurant1.close();
        restaurant1.food();
        System.out.println("-----------------");
        SagarHotel sagarHotel = new SagarHotel();
        sagarHotel.room();
        sagarHotel.timing();
        sagarHotel.open();
        sagarHotel.close();
        sagarHotel.food();
        System.out.println("-----------------");
        Restaurant restaurant = new SagarHotel();
        restaurant.room();
        restaurant.timing();
        restaurant.open();
        restaurant.close();
        restaurant.food();
    }
}
