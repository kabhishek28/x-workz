package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.ClinicalPharmacist;
import com.xworkz.IsARelation.internal.Pharmacist;

public class ClinicalPharmacistRunner {
    public static void main(String[] args) {

        Pharmacist pharmacist1 = new Pharmacist();
        pharmacist1.dispenseMedicine();
        pharmacist1.provideDrugInformation();
        pharmacist1.checkPrescription();
        pharmacist1.counselPatients();
        pharmacist1.manageInventory();

        System.out.println("-------------");
        Pharmacist pharmacist = new ClinicalPharmacist();
        pharmacist.dispenseMedicine();
        pharmacist.provideDrugInformation();
        pharmacist.checkPrescription();
        pharmacist.counselPatients();
        pharmacist.manageInventory();

        System.out.println("-------------");
        ClinicalPharmacist clinicalPharmacist = new ClinicalPharmacist();
        clinicalPharmacist.dispenseMedicine();
        clinicalPharmacist.provideDrugInformation();
        clinicalPharmacist.checkPrescription();
        clinicalPharmacist.counselPatients();
        clinicalPharmacist.manageInventory();


    }
}
