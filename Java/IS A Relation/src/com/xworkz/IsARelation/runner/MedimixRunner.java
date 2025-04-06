package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Medimix;
import com.xworkz.IsARelation.internal.Shampoo;

public class MedimixRunner {
    public static void main(String[] args) {
        Shampoo shampoo = new Shampoo();
        shampoo.apply();
        shampoo.clean();
        shampoo.rub();
        shampoo.rinse();
        shampoo.wash();

        System.out.println("----------------");
        Shampoo shampoo1  = new Medimix();
        shampoo1.apply();
        shampoo1.clean();
        shampoo1.rub();
        shampoo1.rinse();
        shampoo1.wash();
        System.out.println("------------");
        Medimix medimix = new Medimix();
        medimix.apply();
        medimix.clean();
        medimix.rub();
        medimix.rinse();
        medimix.wash();
    }




}
