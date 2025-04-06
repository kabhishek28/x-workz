package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Person;

public class Teacher extends Person {
    public Teacher(){
        System.out.println("no parameter Teacher");
    }

@Override
    public void name(){
        System.out.println("@Override :name person");
    }
    @Override
    public void percentage(){
        System.out.println("@Override :percentage person");
    }
    @Override
    public void edu(){
        System.out.println("@Override :edu person");
    }
    @Override
    public void UG(){
        System.out.println("@Override :UG person");
    }
    @Override
    public void PG(){
        System.out.println("@Override :PG person");
    }
}
