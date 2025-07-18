package com.xworkz.countries.runner;

import com.xworkz.countries.dto.*;

public class CountriesRunner {
    public static void main(String[] args) {

        Chancellor chancellor = new Chancellor("Ravi",3);
        University university = new University("VTU","Belgavi",chancellor);
        Education education = new Education("BSC","MSC",university);
        Detail detail = new Detail("koturu",7894561230L,education);
        Staff staff = new Staff(8520,"M vijay","IAS",detail);


        System.out.println(staff.getName() +"--->"+education.getUniversity() );

    }
}