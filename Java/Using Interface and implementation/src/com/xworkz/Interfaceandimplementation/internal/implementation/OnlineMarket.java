package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.DiscountPolicy;

public class OnlineMarket implements DiscountPolicy {
    @Override
    public void applyDiscount() {
        System.out.println("Online store applies discounts on selected items.");
    }
}
