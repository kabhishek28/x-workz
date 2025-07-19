package com.xworkz.countries.runner;

import com.xworkz.countries.dto.*;

import java.util.*;
import java.util.stream.Collectors;

public class CountriesRunner {
    public static void main(String[] args) {

        Chancellor chancellor = new Chancellor("Ravi",3);
        University university = new University("VTU","Belgavi",chancellor);
        Education education = new Education("BSC","MSC",university);

        Detail detail = new Detail("koturu",7894561230L,education);
        Detail detail1 = new Detail("bengalore",12851230L,education);
        Detail detail2 = new Detail("mangalore",963561230L,education);
        Detail detail3 = new Detail("ballari",147258369L,education);

        Staff staff = new Staff(852,"Harsha","Income Tax",detail);
        Staff staff1 = new Staff(789,"Manju","RBI",detail1);
        Staff staff2 = new Staff(369,"Varun","gramina bank",detail2);
        Staff staff3 = new Staff(753,"Jagadish","karnatak bank",detail3);


        List<Staff> staffList = new ArrayList<>();
        staffList.add(staff);
        staffList.add(staff1);
        staffList.add(staff2);
        staffList.add(staff3);

        HeadOfDepartment headOfDepartment = new HeadOfDepartment("M Vijay Kumar" , 70000,staffList);



        System.out.println(headOfDepartment.getName() +"------>");
        staffList
                .stream()
                .filter(sl -> sl.getName().contains("Manju"))
                .forEach(sl-> System.out.println("Staff Name -----> " + sl.getName() +" "+ sl.getPosition() +" "+sl.getDetail()));


        List<Education> educationList=staffList
                .stream()
                .filter(e->true)
                .map(staffDTO->staffDTO.getDetail().getEducation()).collect(Collectors.toList());
        educationList.forEach(e-> System.out.println(e));


    }
}