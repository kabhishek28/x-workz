package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.ICUNurse;
import com.xworkz.IsARelation.internal.Nurse;

public class NurseUtil {

        public NurseUtil() {
            System.out.println("NurseUtil Constructor");
        }

        public void getNurseDetails(Nurse nurse) {
            if (nurse != null) {
                nurse.assistDoctor();
                nurse.administerMedicine();
                nurse.checkPatientVitals();
                nurse.providePatientCare();
                nurse.handleMedicalEquipment();

                if (nurse instanceof ICUNurse) {
                    ICUNurse icuNurse = (ICUNurse) nurse;
                    icuNurse.monitorCriticalPatients();
                } else {
                    System.out.println("nurse is not an instance of ICUNurse");
                }

                System.out.println("----- Nurse Behavior Displayed -----");
            } else {
                System.out.println("Nurse object is null");
            }
        }


}
