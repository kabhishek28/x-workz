package com.xworkz.IsARelation.external;


import com.xworkz.IsARelation.internal.Cardiologistt;

public class InterventionalCardiologist extends Cardiologistt {
    public InterventionalCardiologist() {
        System.out.println("Interventional Cardiologist Constructor");
    }

    @Override
    public void checkHeartRate() {
        System.out.println("@Override :Cardiologist is checking heart rate");
    }
    @Override
    public void performAngioplasty() {
        System.out.println("@Override :Cardiologist is performing angioplasty");
    }
    @Override
    public void diagnoseHeartDiseases() {
        System.out.println("@Override :Cardiologist is diagnosing heart diseases");
    }
    @Override
    public void adviseLifestyleChanges() {
        System.out.println("@Override :Cardiologist is advising lifestyle changes");
    }
    @Override
    public void prescribeHeartMedication() {
        System.out.println("@Override :Cardiologist is prescribing heart medication");
    }
    public void performStentPlacement() {
            System.out.println("Interventional Cardiologist is performing stent placement procedure...");
        }


}