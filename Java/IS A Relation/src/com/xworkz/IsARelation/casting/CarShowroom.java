package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Car;
import com.xworkz.IsARelation.internal.FourWheeler;

public class CarShowroom {
    public CarShowroom(){
        System.out.println("Car showroom Const");
    }

    public  void  getCar(FourWheeler fourWheeler){
        if(fourWheeler != null){
            fourWheeler.stopEngine();
            fourWheeler.stopEngine();
            fourWheeler.turnLeft();
            fourWheeler.turnRight();
            fourWheeler.applyBrakes();
            if(fourWheeler instanceof Car){
                Car car = (Car) fourWheeler;
                car.riseSpeed();
            }else{
                System.out.println("four Whleere is not instances of car");
            }

        }else{
            System.out.println("fourWheeler is Null");
        }

    }
}
