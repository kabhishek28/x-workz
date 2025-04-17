package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.ElectricCar;

public class TeslaModelS implements ElectricCar {


        @Override
        public void chargeBattery() {
            System.out.println("Tesla Model S is charging its battery.");
        }

        @Override
        public void drive() {
            System.out.println("Tesla Model S is driving smoothly.");
        }

        @Override
        public void showStatus() {
            System.out.println("Tesla Model S status: Fully charged and ready to go.");
        }


}
