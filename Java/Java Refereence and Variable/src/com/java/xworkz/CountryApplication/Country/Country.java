package com.java.xworkz.CountryApplication.Country;

public class Country {
    String name = "INDIA";
    String type = "Democracy Country";
    String population = "1,460,246,398";
    int yearOfIndependence = 1947;
    PrimeMinister primeMinister = new PrimeMinister();


    void display(){
        System.out.println("---------COUNTRY-------------");
        System.out.println("Name :"+name);
        System.out.println("Country Type :"+type);
        System.out.println("Population :"+population);
        System.out.println("Year Of Independence :"+yearOfIndependence);
        System.out.println("------------------------------");
        primeMinister.getPrimeMinister();
    }





}
