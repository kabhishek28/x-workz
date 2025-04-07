package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.InterventionalCardiologist;
import com.xworkz.IsARelation.internal.Cardiologistt;

public class CardiologistUtil {


        public CardiologistUtil() {
            System.out.println("CardiologistUtil Constructor");
        }

        public void showCardiologistDetails(Cardiologistt cardiologistt) {
            if (cardiologistt != null) {
                cardiologistt.checkHeartRate();
                cardiologistt.performAngioplasty();
                cardiologistt.diagnoseHeartDiseases();
                cardiologistt.adviseLifestyleChanges();
                cardiologistt.prescribeHeartMedication();

                if (cardiologistt instanceof InterventionalCardiologist) {
                    InterventionalCardiologist interventionalCardiologist = (InterventionalCardiologist) cardiologistt;
                    interventionalCardiologist.performStentPlacement();
                } else {
                    System.out.println("This is a General Cardiologist");
                }

            } else {
                System.out.println("Cardiologist object is null");
            }
        }


}
