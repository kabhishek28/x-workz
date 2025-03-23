package com.java.xworkz.CountryApplication.Country;

import com.java.xworkz.CountryApplication.Ministers.Minister;
import com.java.xworkz.CountryApplication.PersonalAssistant.PersonAssistant;

public class PrimeMinister {
    String name = "Narendra Modi";
    String party = "Bharatiya Janata Party (BJP)";
    int age = 74;
    String howManyYear = "third consecutive time";

    Minister minister1 = new Minister("Rajnath Singh",73,"Minister of Defence of India","BJP");

    Minister minister2 = new Minister("Amit Shah",60,"Minister of Home Affairs of India","BJP");

    Minister minister3 = new Minister("H. D. Kumaraswamy",65,"Minister of Heavy Industries and Minister of Steel","JDS");

    Minister minister4 = new Minister("hirag Paswan",42,"Minister of Food Processing Industries","Lok Janshakti Party ");

    Minister[] ministers = {minister1,minister2,minister3,minister4};

    PersonAssistant personAssistant1 = new PersonAssistant("Shri Amit Kishore","Madhya Pradesh",32,300000);
    PersonAssistant personAssistant2 = new PersonAssistant("Govind Mohan","ANDHRA PRADESH",25,350000);
    PersonAssistant personAssistant3 = new PersonAssistant("Dr S Tejaswi Naik","Karnataka",28,400000);
    PersonAssistant personAssistant4 = new PersonAssistant("Alok kumar Singh","Uttar Pradesh",45,550000);
    PersonAssistant[] personAssistants = {personAssistant1,personAssistant2,personAssistant3,personAssistant4};










    void getPrimeMinister(){
        System.out.println("-------------PRIME MINISTER--------------");
        System.out.println("Prime Minister Name :"+name);
        System.out.println("Prime Minister age :"+age);
        System.out.println("Prime Minister party :"+party);
        System.out.println("Prime Minister From :"+howManyYear);
        //System.out.println("-------------------------------------");



        System.out.println("______________________________________________Prime Minister has 4 Ministers____________________________________________");
        for(int i = 0 ; i < personAssistants.length ; i++ ){
            System.out.println("*********************************************Minister"+(i+1)+"******************************************************");
            ministers[i].getMinister(i);
            personAssistants[i].getPersonAssistant( i);

        }
//        System.out.println("-----------------minister 1----------------------");
//        minister1.getMinister();
//        personAssistant1.getPersonAssistant();
//        System.out.println("-----------------minister 2----------------------");
//        minister2.getMinister();
//        personAssistant2.getPersonAssistant();
//        System.out.println("-----------------minister 3----------------------");
//        minister3.getMinister();
//        personAssistant3.getPersonAssistant();
//        System.out.println("-----------------minister 4----------------------");
//        minister4.getMinister();
//        personAssistant4.getPersonAssistant();


//        for(Minister  ref : ministers){
//            ref.getMinister();
//        }
    }

}
