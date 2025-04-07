package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Ship;

public class CruiseShip extends Ship {
    public CruiseShip() {
        System.out.println("CruiseShip Constructor");
    }
@Override
    public void sail() {
        System.out.println("@Override :Ship is sailing");
    }
    @Override
    public void anchor() {
        System.out.println("@Override:Ship is anchoring");
    }
    @Override
    public void carryCargo() {
        System.out.println("@Override :Ship is carrying cargo");
    }
    @Override
    public void navigate() {
        System.out.println("@Override:Ship is navigating the sea");
    }
    @Override
    public void accommodatePassengers() {
        System.out.println("@Override :Ship accommodates passengers");
    }

    public void serveBuffet() {
        System.out.println("CruiseShip is serving a luxurious buffet");
    }

}