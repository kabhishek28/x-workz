package com.xworkz.inheritanceandaabstract.internal;

public abstract class Car {
    public Car() {
        System.out.println( "car class  const is running");

    }
    public void getCar(){
        System.out.println("getCar non-abstract method is running");
    }

    public abstract void priceOfCar();

}
