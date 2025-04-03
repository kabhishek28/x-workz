package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.INR;
import com.xworkz.IsARelation.internal.Currency;

public class INRRunner {
    public static void main(String[] args) {
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
