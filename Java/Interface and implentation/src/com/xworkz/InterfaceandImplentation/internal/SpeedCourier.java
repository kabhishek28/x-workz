package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.Courier;

public class SpeedCourier implements Courier {
    @Override
    public void dispatchParcel() {
        System.out.println("Parcel dispatched.");
    }
@Override
    public void trackParcel() {
        System.out.println("Tracking parcel...");
    }
@Override
    public void deliverParcel() {
        System.out.println("Parcel delivered.");
    }
}
