package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.CruiseShip;
import com.xworkz.IsARelation.internal.Ship;

public class ShipService {

        public ShipService() {
            System.out.println("ShipService constructor is running");
        }

        public void getShipDetails(Ship ship) {
            if (ship != null) {
                ship.sail();
                ship.anchor();
                ship.carryCargo();
                ship.navigate();
                ship.accommodatePassengers();

                if (ship instanceof CruiseShip) {
                    CruiseShip cruiseShip = (CruiseShip) ship;
                    cruiseShip.serveBuffet();
                } else {
                    System.out.println("ship is not an instance of CruiseShip");
                }
            }
        }


}
