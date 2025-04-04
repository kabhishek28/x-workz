package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Police;
import com.xworkz.IsARelation.internal.Government;

public class PoliceRunner {
    public static void main(String[] args) {
        Government government = new Police();
        government.makeLaws();
        government.collectTaxes();
        government.provideSecurity();
        government.manageEconomy();
        government.maintainInfrastructure();

        System.out.println("-------------------");

        Police police = new Police();
        police.makeLaws();
        police.collectTaxes();
        police.provideSecurity();
        police.manageEconomy();
        police.maintainInfrastructure();
    }
}
