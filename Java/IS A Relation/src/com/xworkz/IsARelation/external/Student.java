package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.College;

public class Student extends College {
    public Student(){
        System.out.println("student zero parameter const");
    }
@Override
    public void name(){
        System.out.println("@Override :name method of college classs");
    }
    @Override
    public void address(){
        System.out.println("@Override :address of method of class of college");
    }
    @Override
    public void isVTU(){
        System.out.println("@Override :is VTU method is running");
    }
}
