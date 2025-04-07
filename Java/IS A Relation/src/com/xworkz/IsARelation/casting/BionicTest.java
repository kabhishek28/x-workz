package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.AdvancedBionicArm;
import com.xworkz.IsARelation.internal.BionicLimb;

public class BionicTest {
    public void test(BionicLimb bionicLimb){
        System.out.println("BionicLimb is testing from the BIONICTEST class");
        bionicLimb.adjustGripStrength();
        bionicLimb.detectSignals();
        bionicLimb.moveFingers();
        bionicLimb.selfRepair();
        bionicLimb.trackUsageData();

//        if(bionicLimb instanceof AdvancedBionicArm) {
//            AdvancedBionicArm advancedBionicArm = (AdvancedBionicArm) bionicLimb;
//            advancedBionicArm.connectToApp();
//
//
//        }
    }

    public void test1(BionicLimb bionicLimb){
        bionicLimb.adjustGripStrength();
        bionicLimb.detectSignals();
        bionicLimb.moveFingers();
        bionicLimb.selfRepair();
        bionicLimb.trackUsageData();
    }

    public void test2(AdvancedBionicArm advancedBionicArm){
        advancedBionicArm.adjustGripStrength();
        advancedBionicArm.detectSignals();
        advancedBionicArm.moveFingers();
        advancedBionicArm.selfRepair();
        advancedBionicArm.trackUsageData();
        advancedBionicArm.connectToApp();
    }


    public void test3(BionicLimb bionicLimb){
        System.out.println("BionicLimb is testing from the BIONICTEST class");
        bionicLimb.adjustGripStrength();
        bionicLimb.detectSignals();
        bionicLimb.moveFingers();
        bionicLimb.selfRepair();
        bionicLimb.trackUsageData();

        if(bionicLimb instanceof AdvancedBionicArm) {
            AdvancedBionicArm advancedBionicArm = (AdvancedBionicArm) bionicLimb;
            advancedBionicArm.connectToApp();
        }else {
            System.out.println("NO bionicLimb is not Instances of subclass");
        }
    }
}
