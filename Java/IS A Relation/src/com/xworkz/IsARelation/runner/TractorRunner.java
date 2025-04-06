package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Tractor;
import com.xworkz.IsARelation.internal.AgriculturalEquipment;
import com.xworkz.IsARelation.internal.AutoMobile;

public class TractorRunner {
    public static void main(String[] args) {
        AgriculturalEquipment agriculturalEquipment = new AgriculturalEquipment();
        agriculturalEquipment.maintainEquipment();
        agriculturalEquipment.harvestCrops();
        agriculturalEquipment.prepareSoil();
        agriculturalEquipment.sowSeeds();
        agriculturalEquipment.irrigateCrops();
        System.out.println("------------------------");
        AgriculturalEquipment agriculturalEquipment1 = new Tractor();
        agriculturalEquipment1.maintainEquipment();
        agriculturalEquipment1.harvestCrops();
        agriculturalEquipment1.prepareSoil();
        agriculturalEquipment1.sowSeeds();
        agriculturalEquipment1.irrigateCrops();
        System.out.println("-----------------------");
        Tractor tractor = new Tractor();
        tractor.irrigateCrops();
        tractor.maintainEquipment();
        tractor.sowSeeds();
        tractor.harvestCrops();
        tractor.prepareSoil();

    }
}
