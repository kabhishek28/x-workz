package com.xworkz.IsARelation.runner;


import com.xworkz.IsARelation.external.Truck;
import com.xworkz.IsARelation.internal.Vehicle;

public class carrRunner {
        public static void main(String[] args) {
            Vehicle vehicle = new Vehicle();
            vehicle.fuelType();
            vehicle.speed();
            vehicle.capacity();
            vehicle.wheels();
            vehicle.engine();

            System.out.println("******************");

            Truck car = new Truck();
            car.fuelType();
            car.speed();
            car.capacity();
            car.wheels();
            car.engine();

        }


}
