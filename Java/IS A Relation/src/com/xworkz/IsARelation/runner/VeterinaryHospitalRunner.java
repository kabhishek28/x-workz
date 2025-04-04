package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.VeterinaryHospital;
import com.xworkz.IsARelation.internal.Hospital;

public class VeterinaryHospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new VeterinaryHospital();
        hospital.admitPatient();
        hospital.provideTreatment();
        hospital.performSurgery();
        hospital.dischargePatient();
        hospital.managePharmacy();

        System.out.println("-------------------");

        VeterinaryHospital vetHospital = new VeterinaryHospital();
        vetHospital.admitPatient();
        vetHospital.provideTreatment();
        vetHospital.performSurgery();
        vetHospital.dischargePatient();
        vetHospital.managePharmacy();
    }
}
