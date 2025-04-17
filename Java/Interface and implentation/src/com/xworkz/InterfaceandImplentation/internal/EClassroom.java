package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.VirtualClassroom;

public class EClassroom implements VirtualClassroom {
    @Override
    public void joinClass() {
        System.out.println("Joining the virtual classroom.");
    }

    @Override
    public void participateDiscussion() {
        System.out.println("Participating in class discussion.");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Assignment submitted online.");
    }
}