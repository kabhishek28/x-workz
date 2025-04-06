package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Robot;

public class HumanoidRobot extends Robot {
    public HumanoidRobot() {
        System.out.println("No-argument constructor: HumanoidRobot");
    }

@Override
    public void powerOn() {
        System.out.println("@Override :Robot is powered on");
    }
    @Override
    public void move() {
        System.out.println("@Override :Robot is moving");
    }
    @Override
    public void processData() {
        System.out.println("@Override :Robot is processing data");
    }
    @Override
    public void communicate() {
        System.out.println("@Override:Robot is communicating");
    }
    @Override
    public void shutdown() {
        System.out.println("@Override :Robot is shutting down");
    }
}
