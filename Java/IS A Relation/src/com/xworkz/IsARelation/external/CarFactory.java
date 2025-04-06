package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Factory;

public class CarFactory extends Factory {
    public CarFactory() {
        System.out.println("CarFactory Constructor");
    }

    @Override
    public void produceGoods() {
        System.out.println("@Override :Factory is producing goods");
    }
    @Override
    public void maintainMachinery() {
        System.out.println("@Override :Factory is maintaining machinery");
    }
    @Override
    public void hireWorkers() {
        System.out.println("@Override :Factory is hiring workers");
    }
    @Override
    public void distributeProducts() {
        System.out.println("@Override :Factory is distributing products");
    }
    @Override
    public void ensureSafety() {
        System.out.println("@Override :Factory is ensuring safety");
    }
}