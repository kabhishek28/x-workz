package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.FashionBoutique;

public class TrendyBoutique implements FashionBoutique {
    @Override
    public void displayCollection() {
        System.out.println("Trendy Boutique is displaying its latest collection.");
    }

    @Override
    public void assistCustomer() {
        System.out.println("Trendy Boutique assisting a customer with style advice.");
    }

    @Override
    public void processPurchase() {
        System.out.println("Trendy Boutique processing the purchase.");
    }
}