package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.MRISpecialist;
import com.xworkz.IsARelation.internal.Radiologist;

public class MRISpecialistRunner {
    public static void main(String[] args) {

        Radiologist radiologist1 = new Radiologist();
        radiologist1.conductXRay();
        radiologist1.analyzeScans();
        radiologist1.performUltrasound();
        radiologist1.diagnoseInjuries();
        radiologist1.collaborateWithDoctors();

        System.out.println("--------------");
        Radiologist radiologist = new MRISpecialist();
        radiologist.conductXRay();
        radiologist.analyzeScans();
        radiologist.performUltrasound();
        radiologist.diagnoseInjuries();
        radiologist.collaborateWithDoctors();

        System.out.println("--------------");
        MRISpecialist mriSpecialist = new MRISpecialist();
        mriSpecialist.conductXRay();
        mriSpecialist.analyzeScans();
        mriSpecialist.performUltrasound();
        mriSpecialist.diagnoseInjuries();
        mriSpecialist.collaborateWithDoctors();


    }
}
