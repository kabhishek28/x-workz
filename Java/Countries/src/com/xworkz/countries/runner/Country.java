package com.xworkz.countries.runner;

import com.xworkz.countries.repository.FindCountries;
import com.xworkz.countries.repository.FindCountriesImplementation;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Comparator;
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


        System.out.println("-------------Stream all countries starting with G------------------");
        collection
                .stream()
                .filter((c)->c.toLowerCase().startsWith("g"))
                .forEach(c->System.out.println(c));


        System.out.println("----------------------------Stream all countries ending with a-------------------------------");
        collection.stream().filter((c)->c.toLowerCase().endsWith("a")).forEach(c-> System.out.println(c));


        System.out.println("------Sort all countries by desc---------------");
        collection
                .stream().sorted(Comparator.reverseOrder())
                .forEach(c-> System.out.println(c));


        System.out.println("----------------------- Sort all countries by asc-----------------------------------------");
        collection
                .stream()
                .sorted().forEach(c-> System.out.println(c));

        System.out.println("------------------------------Stream all countries with more than 6 characters-----------------------------------");
        collection
                .stream()
                .filter((s)->s.length()>6).forEach(c-> System.out.println(c));


        System.out.println("------------------------------8. Stream all countries with less than 4 characters---------------------------------");
        collection
                .stream()
                .filter((c)->c.length()<=4)
                .forEach(c-> System.out.println(c));


        System.out.println("-------------------------Stream all countries which contains 'O'------------------------");
        collection
                .stream()
                .filter((c)->c.toLowerCase().contains("o")).forEach(c-> System.out.println(c));

//        System.out.println("----------------------------------10. Stream all countries which has a character occurence more than once------------------------------------");
//        collection.stream().filter((c)->c.toLowerCase().);


//        System.out.println("-------------------------12. Stream and find palindrome country--------------------------");
//        collection
//                .stream()
//                .filter(c->palindrom(c).);

//        public boolean palindrom(String name ){
//
//        }















        //        Bottle bottle = (int no)->{
////            System.out.println("running lamda impl :"+no);
////            if(no>0){
////                return true;
////            }
////            return false;
////        };

//            Customer customer = new Customer();
//            customer.buy((no)->no>0);
    }
}
