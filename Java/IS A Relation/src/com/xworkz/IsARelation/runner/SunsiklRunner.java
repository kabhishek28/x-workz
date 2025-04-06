package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Sunsilk;
import com.xworkz.IsARelation.internal.HairCareProduct;

public class SunsiklRunner {

    public static void main(String[] args) {
        HairCareProduct hairCareProduct = new HairCareProduct();
        hairCareProduct.nourishHair();
        hairCareProduct.reduceHairFall();
        hairCareProduct.addShine();
        hairCareProduct.repairDamage();
        hairCareProduct.strengthenRoots();
        System.out.println("--------------");

        HairCareProduct hairCareProduct1 = new Sunsilk();
        hairCareProduct1.strengthenRoots();
        hairCareProduct1.repairDamage();
        hairCareProduct1.addShine();
        hairCareProduct1.nourishHair();
        hairCareProduct1.reduceHairFall();

        System.out.println("-----------------");

        Sunsilk sunsilk = new Sunsilk();
        sunsilk.addShine();
        sunsilk.nourishHair();
        sunsilk.reduceHairFall();
        sunsilk.repairDamage();
        sunsilk.strengthenRoots();
    }
}
