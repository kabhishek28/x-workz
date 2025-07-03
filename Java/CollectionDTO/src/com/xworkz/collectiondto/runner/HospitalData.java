package com.xworkz.collectiondto.runner;

import com.xworkz.collectiondto.dto.HospitalDTO;

import java.util.ArrayList;
import java.util.Collection;

public class HospitalData {
    public static void main(String[] args) {
        Collection<HospitalDTO> hospitalDTOCollection = new ArrayList<>();
        hospitalDTOCollection.add(new HospitalDTO("Sneha", 29, "Female", "Gynecology", "Dr. Anita Rao", true, 12500.0));
        hospitalDTOCollection.add(new HospitalDTO("Arjun", 34, "Male", "Cardiology", "Dr. Mehra", false, 22000.0));
        hospitalDTOCollection.add(new HospitalDTO("Divya", 40, "Female", "Orthopedics", "Dr. Naresh", true, 15800.0));
        hospitalDTOCollection.add(new HospitalDTO("Kiran", 19, "Male", "Dermatology", "Dr. Ramesh", false, 3500.0));
        hospitalDTOCollection.add(new HospitalDTO("Priya", 30, "Female", "Pediatrics", "Dr. Seema", true, 9800.0));
        hospitalDTOCollection.add(new HospitalDTO("Rahul", 45, "Male", "Neurology", "Dr. Sandeep", true, 26000.0));
        hospitalDTOCollection.add(new HospitalDTO("Asha", 52, "Female", "General Surgery", "Dr. George", false, 18000.0));
        hospitalDTOCollection.add(new HospitalDTO("Nikhil", 27, "Male", "ENT", "Dr. Swathi", false, 4200.0));
        hospitalDTOCollection.add(new HospitalDTO("Meghana", 36, "Female", "Psychiatry", "Dr. Karthik", true, 8900.0));
        hospitalDTOCollection.add(new HospitalDTO("Vinith",22,"male","OPD","Ravi ganti",true,7000.0));

        for(HospitalDTO hospitalDTO : hospitalDTOCollection){
            System.out.println(hospitalDTO.toString());
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }
}
