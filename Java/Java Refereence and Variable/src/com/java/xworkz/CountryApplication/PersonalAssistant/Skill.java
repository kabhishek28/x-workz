package com.java.xworkz.CountryApplication.PersonalAssistant;

public class Skill {

    String[] certifications;
    int yearsOfExperience;
    boolean hasWeaponHandlingSkills;
    String[] languagesSpoken;

    //String name;


    Skill(String[] certifications,int yearsOfExperience,boolean hasWeaponHandlingSkills,String[] languagesSpoken){
        this.certifications =certifications;
        this.yearsOfExperience = yearsOfExperience;
        this. hasWeaponHandlingSkills = hasWeaponHandlingSkills;
        this.languagesSpoken = languagesSpoken;
    }



    ExperienceDetail experienceDetail1 = new ExperienceDetail("Bengaluru",new String[]{"VIP Escort", "Surveillance", "Risk Assessment"},new String[]{"Protected high-profile clients", "Awarded Best Security Officer"},new String[]{"Advanced Driving", "Crisis Management", "Firearm Training"});

    ExperienceDetail experienceDetail2 = new ExperienceDetail(
            "Delhi",
            new String[]{"Close Protection", "Crowd Control", "Event Security"},
            new String[]{"Successfully secured VIPs", "Managed large public events"},
            new String[]{"Tactical Driving", "Crisis Response", "First Aid"}
    );

    ExperienceDetail experienceDetail3 = new ExperienceDetail(
            "Hyderabad",
            new String[]{"Tactical Operations", "Surveillance", "VIP Protection"},
            new String[]{"Neutralized security threats", "Protected dignitaries during high-risk events"},
            new String[]{"Advanced Firearm Handling", "Surveillance Techniques", "Risk Management"}
    );


    ExperienceDetail experienceDetail4 = new ExperienceDetail(
            "Bengaluru",
            new String[]{"VIP Escort", "Surveillance", "Risk Assessment"},
            new String[]{"Protected high-profile clients", "Awarded Best Security Officer"},
            new String[]{"Advanced Driving", "Crisis Management", "Firearm Training"}
    );



    ExperienceDetail[] experienceDetails = {experienceDetail1,experienceDetail2,experienceDetail3,experienceDetail4};





    void getSkill(String name,int i){
        System.out.println("-----------Skill-----------");
        //this.name = name;
        System.out.println(name+" has the Certifications on :"+String.join(", ",certifications));
        System.out.println(name+" has the Experience  :"+yearsOfExperience);
        System.out.println(name+" whether is knows the Wepon Handling :"+hasWeaponHandlingSkills);
        System.out.println(name+" has knows the languages :"+String.join(", ",languagesSpoken));
        experienceDetails[i].getExperienceDetail(i);
    }


}
