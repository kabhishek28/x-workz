package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.AgriculturalEquipment;


public class Tractor extends AgriculturalEquipment {

    public  Tractor(){
        System.out.println("No argument const of tractor");
    }


@Override
    public void prepareSoil() {
        System.out.println("@Override :Preparing the soil for cultivation...");
    }
    @Override
    public void sowSeeds() {
        System.out.println("@Override :Sowing seeds in the field...");
    }
    @Override
    public void irrigateCrops() {
        System.out.println("@Override :Irrigating the crops...");
    }
    @Override
    public void harvestCrops() {
        System.out.println("@Override :Harvesting the crops...");
    }
    @Override
    public void maintainEquipment() {
        System.out.println("@Override :Maintaining agricultural equipment...");
    }

}
