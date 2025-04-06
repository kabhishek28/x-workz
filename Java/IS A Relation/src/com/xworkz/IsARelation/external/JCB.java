package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.AutoMobile;
import com.xworkz.IsARelation.internal.ConstructionMachine;

public class JCB extends ConstructionMachine {
    public JCB(){
        System.out.println("no arguments const of JCB");
    }



@Override
    public void operate() {
        System.out.println("@Override :Operating the construction machine...");
    }
    @Override
    public void loadMaterial() {
        System.out.println("@Override :Loading construction material...");
    }
    @Override
    public void moveToSite() {
        System.out.println("@Override :Moving machine to construction site...");
    }
    @Override
    public void performMaintenance() {
        System.out.println("@Override :Performing maintenance check...");
    }
    @Override
    public void shutDown() {
        System.out.println("@Override :Shutting down the construction machine...");
    }
}
