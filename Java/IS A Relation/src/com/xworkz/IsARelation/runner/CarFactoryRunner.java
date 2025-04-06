package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.CarFactory;
import com.xworkz.IsARelation.internal.Factory;

public class CarFactoryRunner {
    public static void main(String[] args) {

        Factory factory1 = new Factory();
        factory1.produceGoods();
        factory1.maintainMachinery();
        factory1.hireWorkers();
        factory1.distributeProducts();
        factory1.ensureSafety();
        System.out.println("-----------------");
        Factory factory = new CarFactory();
        factory.produceGoods();
        factory.maintainMachinery();
        factory.hireWorkers();
        factory.distributeProducts();
        factory.ensureSafety();

        System.out.println("-------------");

        CarFactory carFactory = new CarFactory();
        carFactory.produceGoods();
        carFactory.maintainMachinery();
        carFactory.hireWorkers();
        carFactory.distributeProducts();
        carFactory.ensureSafety();
    }
}
