package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.SurgicalRobot;
import com.xworkz.IsARelation.internal.MedicalRobot;

public class MedicalRobotRunner {
    public static void main(String[] args) {
        MedicalRobot medicalRobot = new MedicalRobot();
        medicalRobot.diagnose();
        medicalRobot.assistSurgery();
        medicalRobot.dispenseMedicine();
        medicalRobot.monitorVitals();
        medicalRobot.sterilizeEquipment();
        System.out.println("------------------");
        MedicalRobot robot = new SurgicalRobot();
        robot.diagnose();
        robot.assistSurgery();
        robot.dispenseMedicine();
        robot.monitorVitals();
        robot.sterilizeEquipment();

        System.out.println("******************");

        SurgicalRobot surgicalRobot = new SurgicalRobot();
        surgicalRobot.diagnose();
        surgicalRobot.assistSurgery();
        surgicalRobot.dispenseMedicine();
        surgicalRobot.monitorVitals();
        surgicalRobot.sterilizeEquipment();
    }
}
