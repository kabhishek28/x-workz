package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.CafeService;

public class CoffeeCafe implements CafeService {
    @Override
    public void takeOrder() {
        System.out.println("Taking order from the customer.");
    }

    @Override
    public void prepareOrder() {
        System.out.println("Preparing the coffee and snacks.");
    }

    @Override
    public void serveCustomer() {
        System.out.println("Serving the order to the customer.");
    }
}