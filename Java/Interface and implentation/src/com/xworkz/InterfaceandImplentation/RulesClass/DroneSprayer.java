package com.xworkz.InterfaceandImplentation.RulesClass;

public interface DroneSprayer {
    void takeOff();
    void sprayPesticides();
    void returnHome();

    default  void reiseSpeed(){
        System.out.println("reiseSpeed method in DroneSprayer class");
    }
}
