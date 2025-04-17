package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.PropertyDealer;

public class HomeFinder implements PropertyDealer {
    @Override
    public void listProperty() {
        System.out.println("Property listed for sale.");
    }
@Override
    public void showProperty() {
        System.out.println("Showing property to buyer.");
    }
@Override
    public void finalizeDeal() {
        System.out.println("Property deal finalized.");
    }
}
