package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.PropertyManagement;

public class RealEstateAgency implements PropertyManagement {
    @Override
    public void scheduleMaintenance() {
        System.out.println("Scheduling maintenance for the property.");
    }

    @Override
    public void collectRent() {
        System.out.println("Collecting monthly rent from tenants.");
    }

    @Override
    public void updateListing() {
        System.out.println("Updating the property listing information.");
    }
}