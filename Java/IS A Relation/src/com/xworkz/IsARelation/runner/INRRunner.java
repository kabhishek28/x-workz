package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.INR;
import com.xworkz.IsARelation.internal.Currency;

public class INRRunner {
    public static void main(String[] args) {

        Currency currency1 = new Currency();
        currency1.amount();
        currency1.currency();
        currency1.GDP();
        currency1.rate();
        currency1.rate();

        System.out.println("---------------");
        Currency currency = new INR();
        currency.amount();
        currency.currency();
        currency.GDP();
        currency.rate();
        currency.rate();

        System.out.println("---------------");

        INR inr = new INR();
        inr.amount();
        inr.convert();
        inr.currency();
        inr.GDP();
        inr.rate();


    }
}
