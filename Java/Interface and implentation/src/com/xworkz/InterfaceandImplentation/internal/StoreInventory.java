package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.InventoryManagement;

public class StoreInventory implements InventoryManagement {
    @Override
    public void addItem() {
        System.out.println("Adding new item to the inventory.");
    }

    @Override
    public void removeItem() {
        System.out.println("Removing item from the inventory.");
    }

    @Override
    public void checkStock() {
        System.out.println("Checking the current stock levels.");
    }
}