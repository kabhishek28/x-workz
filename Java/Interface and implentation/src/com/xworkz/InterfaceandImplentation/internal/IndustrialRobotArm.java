package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.RobotArm;

public class IndustrialRobotArm implements RobotArm {
    @Override
    public void initialize() {
        System.out.println("Industrial robot arm initializing.");
    }

    @Override
    public void moveArm() {
        System.out.println("Industrial robot arm moving to position.");
    }

    @Override
    public void shutdown() {
        System.out.println("Industrial robot arm shutting down.");
    }
}