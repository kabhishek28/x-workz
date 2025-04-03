package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Medimix;

public class MedimixRunner {
    public static void main(String[] args) {
        Medimix medimix=new Medimix();
        medimix.apply();
        medimix.clean();
        medimix.rub();
        medimix.rinse();
        medimix.wash();
    }
}
