package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.OrderPolicy;

public class FoodDeliveryApp implements OrderPolicy {
    @Override
    public void trackOrder() {
        System.out.println("Food delivery app tracks your order until it is delivered.");
    }
}