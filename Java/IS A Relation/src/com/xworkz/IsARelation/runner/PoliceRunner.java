package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Police;
import com.xworkz.IsARelation.internal.Government;

public class PoliceRunner {
    public static void main(String[] args) {
        Government government1 = new Government();
        government1.makeLaws();
        government1.collectTaxes();
        government1.provideSecurity();
        government1.manageEconomy();
        government1.maintainInfrastructure();

        System.out.println("-------------------");
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
