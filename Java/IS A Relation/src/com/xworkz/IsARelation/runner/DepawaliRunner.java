package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Depawali;
import com.xworkz.IsARelation.internal.IndianFestival;

public class DepawaliRunner {
    public static void main(String[] args) {
        IndianFestival indianFestival = new IndianFestival();
        indianFestival.decorateHome();
        indianFestival.distributePrasad();
        indianFestival.inviteGuests();
        indianFestival.performPuja();
        indianFestival.wearTraditionalClothes();
        System.out.println("------------------------");
        IndianFestival indianFestival1 = new Depawali();
        indianFestival1.decorateHome();
        indianFestival1.distributePrasad();
        indianFestival1.inviteGuests();
        indianFestival1.performPuja();
        indianFestival1.wearTraditionalClothes();
        System.out.println("------------------------");

        Depawali depawali = new Depawali();
        depawali.decorateHome();
        depawali.distributePrasad();
        depawali.inviteGuests();
        depawali.performPuja();
        depawali.wearTraditionalClothes();

    }
}
