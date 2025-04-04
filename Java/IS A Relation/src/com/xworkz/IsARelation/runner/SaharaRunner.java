package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Sahara;
import com.xworkz.IsARelation.internal.Desert;

public class SaharaRunner {
    public static void main(String[] args) {
        Desert desert = new Sahara();
        desert.storeHeat();
        desert.coolAtNight();
        desert.supportDroughtPlants();
        desert.experienceSandstorms();

        Sahara sahara = new Sahara();
        sahara.storeHeat();
        sahara.coolAtNight();
        sahara.supportDroughtPlants();
        sahara.experienceSandstorms();
    }
}
