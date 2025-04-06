package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.TeslaCar;
import com.xworkz.IsARelation.internal.ElectricVehicle;

public class ElectricVehicleRunner {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new ElectricVehicle();
        electricVehicle.chargeBattery();
        electricVehicle.drive();
        electricVehicle.autopilot();
        electricVehicle.energyConsumption();
        electricVehicle.ecoMode();

        System.out.println("******************");
        ElectricVehicle ev = new TeslaCar();
        ev.chargeBattery();
        ev.drive();
        ev.autopilot();
        ev.energyConsumption();
        ev.ecoMode();

        System.out.println("******************");

        TeslaCar tesla = new TeslaCar();
        tesla.chargeBattery();
        tesla.drive();
        tesla.autopilot();
        tesla.energyConsumption();
        tesla.ecoMode();
    }
}
