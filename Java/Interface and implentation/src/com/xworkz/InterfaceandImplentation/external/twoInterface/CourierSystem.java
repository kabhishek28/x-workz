package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.Courier;
import com.xworkz.InterfaceandImplentation.RulesClass.CourierService;

public class CourierSystem implements Courier, CourierService {
    @Override
    public void dispatchParcel() {
        System.out.println("dispatch parcel method in two Interfaces");
    }

    @Override
    public void trackParcel() {
        System.out.println("trackParcel  method in two Interfaces");
    }

    @Override
    public void deliverParcel() {
        System.out.println("deliverParcel  method in two Interfaces");
    }

    @Override
    public void pickUpPackage() {
        System.out.println("pickUpPackage  method in two Interfaces");
    }

    @Override
    public void trackPackage() {
        System.out.println("trackPackage  method in two Interfaces");
    }

    @Override
    public void deliverPackage() {
        System.out.println("deliverPackage  method in two Interfaces");
    }
}
