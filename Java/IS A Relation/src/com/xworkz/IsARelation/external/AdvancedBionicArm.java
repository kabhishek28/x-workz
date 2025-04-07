package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.BionicLimb;

public class AdvancedBionicArm extends BionicLimb {

    public AdvancedBionicArm() {
        System.out.println(" No-argument constructor: Advanced Bionic Arm");
    }
    @Override
    public void detectSignals() {
        System.out.println(" @Override :Bionic Limb is detecting neural signals...");
    }
    @Override
    public void moveFingers() {
        System.out.println(" @Override :Bionic Limb is moving fingers...");
    }
    @Override
    public void adjustGripStrength() {
        System.out.println(" @Override :Bionic Limb is adjusting grip strength...");
    }
    @Override
    public void selfRepair() {
        System.out.println(" @Override :Bionic Limb is performing self-repair...");
    }
    @Override
    public void trackUsageData() {
        System.out.println(" @Override :Bionic Limb is tracking usage data...");
    }
    public void connectToApp() {
        System.out.println("Advanced Bionic Arm is connecting to the mobile app for configuration...");
    }
    }

