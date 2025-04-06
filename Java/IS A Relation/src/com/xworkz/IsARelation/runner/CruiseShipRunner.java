package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.CruiseShip;
import com.xworkz.IsARelation.internal.Ship;

public class CruiseShipRunner {
    public static void main(String[] args) {

        Ship ship1 = new Ship();
        ship1.sail();
        ship1.anchor();
        ship1.carryCargo();
        ship1.navigate();
        ship1.accommodatePassengers();

        System.out.println("------------------");
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
