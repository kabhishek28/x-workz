package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.RoyalChalleangres;
import com.xworkz.IsARelation.internal.Ahcohol;

public class RoyalChallengersRunner {
    public static void main(String[] args) {
        RoyalChalleangres royalChalleangres = new RoyalChalleangres();
        royalChalleangres.price();
        royalChalleangres.brand();
        royalChalleangres.percentage();
        royalChalleangres.quantity();
        royalChalleangres.size();

        System.out.println("-------------------");

        Ahcohol ahcohol = new RoyalChalleangres();
        ahcohol.brand();
        ahcohol.percentage();
        ahcohol.price();
        ahcohol.quantity();
        ahcohol.size();
    }
}
