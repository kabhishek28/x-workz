package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Cardiologist;
import com.xworkz.IsARelation.internal.Doctor;

public class CardiologistDoctor {
    public CardiologistDoctor(){
        System.out.println("Cardiologist Doctor Const");
    }

    public void getDoctor(Doctor doctor){
        if(doctor != null){
            doctor.conductCheckup();
            doctor.diagnose();
            doctor.adviseRest();
            doctor.checkVitals();
            doctor.prescribeMedicine();
            if(doctor instanceof Cardiologist){
                Cardiologist cardiologist = (Cardiologist) doctor;
                cardiologist.givingTablets();

            }else{
                System.out.println("doctor is not a instances of Cardiologist");
            }
        }else{
            System.out.println("doctor is null");
        }


    }
}
