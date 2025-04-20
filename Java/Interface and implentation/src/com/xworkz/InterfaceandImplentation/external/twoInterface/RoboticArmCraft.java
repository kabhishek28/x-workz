package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.Robot;
import com.xworkz.InterfaceandImplentation.RulesClass.RobotArm;

public class RoboticArmCraft implements Robot, RobotArm {
    @Override
    public void move() {
        System.out.println("move method form Robot");
    }

    @Override
    public void pickObject() {
        System.out.println("Pick up point from Robot");
    }

    @Override
    public void recharge() {
        System.out.println("Robot Arm from Robot");
    }

    @Override
    public void initialize() {
        System.out.println("initialize method  from RobotArm ");
    }

    @Override
    public void moveArm() {
        System.out.println("move Arm from Robot Arm");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown method from Robot Arm");
    }
}
