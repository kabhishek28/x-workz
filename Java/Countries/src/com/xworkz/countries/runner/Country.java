package com.xworkz.countries.runner;

import com.xworkz.countries.repository.FindCountries;
import com.xworkz.countries.repository.FindCountriesImplementation;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.List;

public class Country {
    public static void main(String[] args) {

        FindCountries findCountries = new FindCountriesImplementation();
        Collection<String> collection = findCountries.printAllCountries();

        System.out.println("-------------print all countries--------------------");
        collection.stream().forEach(System.out::println);
//        System.out.println(collection);

        System.out.println("-------------Stream all countries starting with I------------------");
        collection
                .stream()
                .filter((c)->c.toLowerCase().startsWith("i"))
                .forEach(System.out::println);
    }
}
