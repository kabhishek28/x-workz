package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.HumanoidRobot;
import com.xworkz.IsARelation.internal.Robot;

public class RobotRunner {
    public static void main(String[] args) {
        Robot robot = new HumanoidRobot();
        robot.powerOn();
        robot.move();
        robot.processData();
        robot.communicate();
        robot.shutdown();

        System.out.println("******************");

        HumanoidRobot humanoid = new HumanoidRobot();
        humanoid.powerOn();
        humanoid.move();
        humanoid.processData();
        humanoid.communicate();
        humanoid.shutdown();
    }
}
