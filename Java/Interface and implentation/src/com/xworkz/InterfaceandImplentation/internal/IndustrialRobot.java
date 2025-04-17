package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.Robot;

public class IndustrialRobot implements Robot {
    @Override
    public void move() {
        System.out.println("Robot moving on track.");
    }

    @Override
    public void pickObject() {
        System.out.println("Robot picking up object.");
    }

    @Override
    public void recharge() {
        System.out.println("Robot charging...");
    }
}