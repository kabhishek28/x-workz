package com.java.xworkz.CountryApplication.Country;

public class CountryRunner {
    public static void main(String[] args) {



        PrimeMinister primeMinister=new PrimeMinister();

        Country country = new Country(primeMinister);
        country.display();


    }
}
