package com.java.xworkz.CountryApplication.PersonalAssistant;

public class ExperienceDetail {

    String location;
    String[] responsibilities;
    String[] achievements;
    String[] skillsAcquired;

    ExperienceDetail(String location, String[] responsibilities, String[] achievements, String[] skillsAcquired){
        this.location = location;
        this.responsibilities = responsibilities;
        this.achievements = achievements;
        this.skillsAcquired = skillsAcquired;
    }


    Company company1 = new Company("Mumbai Protection Agency", "Mumbai");
    Company company2 = new Company("Delhi Elite Security Services", "Delhi");
    Company company3 = new Company("Hyderabad Tactical Security Group", "Hyderabad");
    Company company4 = new Company("Chennai VIP Security Solutions", "Chennai");

    Company[] companies = {company1,company2,company3,company4};
    void getExperienceDetail(int i){
        System.out.println("--------------ExperienceDetail--------------");
        System.out.println("location :"+location);
        System.out.println("responsibilities :"+String.join(", ",responsibilities));
        System.out.println("achievements :"+String.join(", ",achievements));
        System.out.println("location :"+String.join(", ",skillsAcquired));
        companies[i].getCompany(i);


    }
}
