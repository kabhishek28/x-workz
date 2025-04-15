package com.xworkz.inheritanceandaabstract.external;

import com.xworkz.inheritanceandaabstract.internal.PG;

import javax.swing.*;

public class FindPG extends PG {
    public FindPG() {
        System.out.println( "FindPG class  const is running");
    }

     @Override
    public void getPG(){
        System.out.println("getPG method is running in sub-class FindPG");
    }

}
