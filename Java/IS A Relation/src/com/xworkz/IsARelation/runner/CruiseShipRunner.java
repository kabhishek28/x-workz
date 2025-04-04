package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.CruiseShip;
import com.xworkz.IsARelation.internal.Ship;

public class CruiseShipRunner {
    public static void main(String[] args) {
        Ship ship = new CruiseShip();
        ship.sail();
        ship.anchor();
        ship.carryCargo();
        ship.navigate();
        ship.accommodatePassengers();

        System.out.println("------------------");

        CruiseShip cruiseShip = new CruiseShip();
        cruiseShip.sail();
        cruiseShip.anchor();
        cruiseShip.carryCargo();
        cruiseShip.navigate();
        cruiseShip.accommodatePassengers();

    }
}
