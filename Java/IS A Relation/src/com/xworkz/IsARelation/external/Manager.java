package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Employee;

public class Manager extends Employee {

    public Manager() {
        System.out.println("No-argument constructor: Manager");
    }

@Override
    public void work() {
        System.out.println("@Override :Employee is working");
    }
    @Override
    public void salary() {
        System.out.println("@Override :Employee has a salary");
    }
    @Override
    public void shift() {
        System.out.println("@Override :Employee has a shift timing");
    }
    @Override
    public void leave() {
        System.out.println("@Override :Employee can take leave");
    }
    @Override
    public void benefits() {
        System.out.println("@Override :Employee gets benefits");
    }

    public void conductMeeting() {
        System.out.println("Manager is conducting a team meeting.");
    }

}



