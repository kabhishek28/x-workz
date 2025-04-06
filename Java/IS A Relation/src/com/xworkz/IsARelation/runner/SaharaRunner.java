package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Sahara;
import com.xworkz.IsARelation.internal.Desert;

public class SaharaRunner {
    public static void main(String[] args) {
        Desert desert1 = new Desert();
        desert1.storeHeat();
        desert1.coolAtNight();
        desert1.supportDroughtPlants();
        desert1.experienceSandstorms();
        System.out.println("------------");
        Desert desert = new Sahara();
        desert.storeHeat();
        desert.coolAtNight();
        desert.supportDroughtPlants();
        desert.experienceSandstorms();
        System.out.println("---------------");
        Sahara sahara = new Sahara();
        sahara.storeHeat();
        sahara.coolAtNight();
        sahara.supportDroughtPlants();
        sahara.experienceSandstorms();
    }
}
