package com.java.xworkz.CountryApplication.PersonalAssistant;

import java.sql.SQLOutput;

public class Security {

    String name;
    String securityCode;
    String batch;
    int experience;


    Personnel personnel1 = new Personnel("Vinith",36,"Driver",true);
    Personnel personnel2 = new Personnel("Rajanna",38,"Security Guard",true);
    Personnel personnel3 = new Personnel("Ramesh",40,"Head of Security",true);
    Personnel personnel4 = new Personnel("Kaushik",56,"Driver",true);



    Personnel[] personnels = {personnel1,personnel2,personnel3,personnel4};
    Security(String name,String securityCode,String batch,int experience){
        this.name = name;
        this.securityCode = securityCode;
        this.batch = batch;
        this.experience = experience;

    }

    Security(String name,String securityCode,String batch,int experience,Personnel[] personnels){
        this.name = name;
        this.securityCode = securityCode;
        this.batch = batch;
        this.experience = experience;

    }







    void getSecurity(int i){
        System.out.println("Security name :"+name);
        System.out.println("Security Security Code :"+securityCode);
        System.out.println("Security Batch :"+batch);
        System.out.println("Security experience :"+experience);
        personnels[i].getPersonnel(i);


    }


}
