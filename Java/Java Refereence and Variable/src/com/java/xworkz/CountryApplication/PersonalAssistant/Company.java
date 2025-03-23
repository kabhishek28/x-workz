package com.java.xworkz.CountryApplication.PersonalAssistant;

 class Company {

        String companyName;
        String companyLocation;


        Company(String companyName, String companyLocation) {
            this.companyName = companyName;
            this.companyLocation = companyLocation;
        }



     Education education1 = new Education("Bachelor of Science", "University of Mumbai", 2015);
     Education education2 = new Education("Master of Business Administration", "Indian Institute of Management Ahmedabad", 2018);
     Education education3 = new Education("Bachelor of Arts", "University of Delhi", 2016);
     Education education4 = new Education("Master of Computer Applications", "National Institute of Technology", 2019);


     Education[] educations = {education1,education2,education3,education4};


     void getCompany(int i) {
            System.out.println("-----------Company-----------");
            System.out.println("Company Name: " + companyName);
            System.out.println("Company Location: " + companyLocation);
            educations[i].getEducation();
        }
}
