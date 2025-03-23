package com.java.xworkz.CountryApplication.PersonalAssistant;

public class PersonAssistant {
    public String name;
    public String place;

    public int age;
    public int salary;

    public PersonAssistant(String name,String place,int age,int salary){
        this.name = name;
        this.place = place;
        this.age = age;
        this.salary = salary;
    }

    public void getPersonAssistant(){
        System.out.println("--------------PersonAssistant--------------------");
        System.out.println("name :"+name);
        System.out.println("place :"+place);
        System.out.println("age :"+age);
        System.out.println("salary :"+salary);
        System.out.println("--------------------------------------------------");

    }


}
