package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Pharmacist;

public class ClinicalPharmacist extends Pharmacist {
    public ClinicalPharmacist() {
        System.out.println("Clinical Pharmacist Constructor");
    }
@Override
    public void dispenseMedicine() {
        System.out.println("@Override :Pharmacist is dispensing medicine");
    }
    @Override
    public void provideDrugInformation() {
        System.out.println("@Override :Pharmacist is providing drug information");
    }
    @Override
    public void checkPrescription() {
        System.out.println("@Override :Pharmacist is checking prescription validity");
    }
    @Override
    public void counselPatients() {
        System.out.println("@Override :Pharmacist is counseling patients on medicine usage");
    }
    @Override
    public void manageInventory() {
        System.out.println("@Override :Pharmacist is managing medicine inventory");
    }

    public void performClinicalReview() {
        System.out.println("Clinical Pharmacist is performing a clinical review");
    }

}