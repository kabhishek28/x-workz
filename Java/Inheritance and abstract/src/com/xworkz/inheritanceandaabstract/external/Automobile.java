package com.xworkz.inheritanceandaabstract.external;

import com.xworkz.inheritanceandaabstract.internal.Car;

public class Automobile extends Car {
    public Automobile() {
        System.out.println("Automobile const is running");
    }
    @Override
    public  void priceOfCar(){
        System.out.println("priceOfCar abstract method is running in sub-class Automobile");
    }
}
