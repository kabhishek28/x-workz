package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.PointOfSale;

public class RetailPOS implements PointOfSale {
    @Override
    public void processTransaction() {
        System.out.println("Processing transaction at the POS.");
    }

    @Override
    public void printReceipt() {
        System.out.println("Printing receipt for the customer.");
    }

    @Override
    public void updateInventory() {
        System.out.println("Updating inventory post-purchase.");
    }
}