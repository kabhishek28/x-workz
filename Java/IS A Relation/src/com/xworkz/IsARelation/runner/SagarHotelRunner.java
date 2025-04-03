package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.SagarHotel;
import com.xworkz.IsARelation.internal.Restaurant;

public class SagarHotelRunner {
    public static void main(String[] args) {
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
