package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.CarFactory;
import com.xworkz.IsARelation.internal.Factory;

public class CarFactoryArea {
    public CarFactoryArea(){
        System.out.println("CarFactoryArea Const");
    }

    public void getCarFactory(Factory factory){
        if(factory != null){
            factory.produceGoods();
            factory.maintainMachinery();
            factory.hireWorkers();
            factory.distributeProducts();
            factory.ensureSafety();
            if(factory instanceof CarFactory){
                CarFactory carFactory = (CarFactory) factory;
                carFactory.production();
            }else{
                System.out.println("factory is not a instances of CAR Factory");
            }
        }else {
            System.out.println("factory is Null");
        }

    }


}
