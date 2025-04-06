package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.AdvancedBionicArm;
import com.xworkz.IsARelation.internal.BionicLimb;

public class BionicLimbRunner {
    public static void main(String[] args) {

        BionicLimb limb1 = new BionicLimb();
        limb1.detectSignals();
        limb1.moveFingers();
        limb1.adjustGripStrength();
        limb1.selfRepair();
        limb1.trackUsageData();
        System.out.println("******************");

        BionicLimb limb = new AdvancedBionicArm();
        limb.detectSignals();
        limb.moveFingers();
        limb.adjustGripStrength();
        limb.selfRepair();
        limb.trackUsageData();

        System.out.println("******************");

        AdvancedBionicArm arm = new AdvancedBionicArm();
        arm.detectSignals();
        arm.moveFingers();
        arm.adjustGripStrength();
        arm.selfRepair();
        arm.trackUsageData();


    }
}
