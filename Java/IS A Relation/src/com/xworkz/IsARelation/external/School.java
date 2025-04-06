package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Classs;

public class School extends Classs {

    public School(){
        System.out.println("zero parameter const of the School");
    }

    @Override
    public void noOfStudent(){
        System.out.println("@Override :noOfStudent of method from the class ");
    }
    @Override
    public void subject(){
        System.out.println("@Override :subject method of the class  ");
    }
    @Override
    public void sec(){
        System.out.println("@Override :sectiopn method form the class");
    }
}
