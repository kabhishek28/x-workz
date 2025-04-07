package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.HumanoidRobot;
import com.xworkz.IsARelation.internal.Robot;

public class RobotUtil {


        public RobotUtil() {
            System.out.println("RobotUtil Constructor");
        }

        public void getRobotDetails(Robot robot) {
            if (robot != null) {
                robot.powerOn();
                robot.move();
                robot.processData();
                robot.communicate();
                robot.shutdown();

                if (robot instanceof HumanoidRobot) {
                    HumanoidRobot humanoid = (HumanoidRobot) robot;
                    humanoid.recognizeFace();
                } else {
                    System.out.println("robot is not an instance of HumanoidRobot");
                }

                System.out.println("----- Robot Behavior Displayed -----");
            } else {
                System.out.println("Robot object is null");
            }
        }


}
