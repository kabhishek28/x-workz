package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Government;

public class Police extends Government {
    public Police() {
        System.out.println("Police Constructor");
    }
@Override
    public void makeLaws() {
        System.out.println("@Override :Government is making laws");
    }
    @Override
    public void collectTaxes() {
        System.out.println("@Override :Government is collecting taxes");
    }
    @Override
    public void provideSecurity() {
        System.out.println("@Override :Government is providing security");
    }
    @Override
    public void manageEconomy() {
        System.out.println("@Override :Government is managing the economy");
    }
    @Override
    public void maintainInfrastructure() {
        System.out.println("@Override :Government is maintaining infrastructure");
    }
}
