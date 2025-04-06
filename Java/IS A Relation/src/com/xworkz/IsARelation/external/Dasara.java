package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Festival;

public class Dasara extends Festival {

    public Dasara(){
        System.out.println("no arguments of dasara class");
    }

    @Override
    public void date(){
        System.out.println(" @Override :Date of the festival class");
    }
    @Override
    public void name(){
        System.out.println(" @Override :name of the festivale classs");


    }
    @Override
    public void sweet(){
        System.out.println(" @Override :sweet of the festivale class");
    }



}
