package com.xworkz.typesofinheritance.SingleLevel.external;

import com.xworkz.typesofinheritance.SingleLevel.Internal.Hospital;

public class Doctor extends Hospital {
    public void treat() {
        System.out.println("Doctor is treating the patient.");
    }
}