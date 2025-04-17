package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.FoodDeliveryApp;

public class QuickEats implements FoodDeliveryApp {
    @Override
    public void placeOrder() {
        System.out.println("Food order placed.");
    }
@Override
    public void assignDelivery() {
        System.out.println("Delivery partner assigned.");
    }
@Override
    public void deliverFood() {
        System.out.println("Food delivered to customer.");
    }
}
