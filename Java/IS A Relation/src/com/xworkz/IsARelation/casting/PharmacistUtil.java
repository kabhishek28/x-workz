package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.ClinicalPharmacist;
import com.xworkz.IsARelation.internal.Pharmacist;

public class PharmacistUtil {



        public PharmacistUtil() {
            System.out.println("PharmacistUtil constructor is running");
        }

        public void getPharmacist(Pharmacist pharmacist) {
            if (pharmacist != null) {
                pharmacist.dispenseMedicine();
                pharmacist.provideDrugInformation();
                pharmacist.checkPrescription();
                pharmacist.counselPatients();
                pharmacist.manageInventory();

                if (pharmacist instanceof ClinicalPharmacist) {
                    ClinicalPharmacist clinical = (ClinicalPharmacist) pharmacist;
                    clinical.performClinicalReview();
                } else {
                    System.out.println("pharmacist is not an instance of ClinicalPharmacist");
                }
            }
        }


}
