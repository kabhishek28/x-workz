package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.OnlineStore;

public class MyStore implements OnlineStore {
    @Override
    public void addToCart() {
        System.out.println("Item added to cart.");
    }
@Override
    public void makePayment() {
        System.out.println("Payment completed.");
    }

    @Override
    public void trackOrder() {
        System.out.println("Order is in transit.");
    }
}
