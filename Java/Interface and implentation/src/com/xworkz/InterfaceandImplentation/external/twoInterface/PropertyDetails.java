package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.PropertyDealer;
import com.xworkz.InterfaceandImplentation.RulesClass.PropertyManagement;

public class PropertyDetails implements PropertyManagement, PropertyDealer {
    @Override
    public void listProperty() {
        System.out.println("listProperty method in two interfaces ");
    }

    @Override
    public void showProperty() {
        System.out.println("showProperty method in two interfaces ");

    }

    @Override
    public void finalizeDeal() {
        System.out.println("finalizeDeal method in two interfaces ");

    }

    @Override
    public void scheduleMaintenance() {
        System.out.println("scheduleMaintenance method in two interfaces ");

    }

    @Override
    public void collectRent() {
        System.out.println("collectRent method in two interfaces ");

    }

    @Override
    public void updateListing() {
        System.out.println("updateListing method in two interfaces ");

    }
}
