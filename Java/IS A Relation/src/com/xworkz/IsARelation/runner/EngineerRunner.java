package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.MechanicalEngineer;
import com.xworkz.IsARelation.internal.Engineer;

public class EngineerRunner {
    public static void main(String[] args) {
        Engineer engineer = new MechanicalEngineer();
        engineer.design();
        engineer.analyze();
        engineer.develop();
        engineer.test();
        engineer.optimize();
        System.out.println("------------------");
        MechanicalEngineer mechanicalEngineer = new MechanicalEngineer();
        mechanicalEngineer.design();
        mechanicalEngineer.analyze();
        mechanicalEngineer.develop();
        mechanicalEngineer.test();
        mechanicalEngineer.optimize();
    }
}
