package com.xworkz.inheritanceandaabstract.runner;

import com.xworkz.inheritanceandaabstract.external.*;

import javax.management.MBeanTrustPermission;

public class Runner {
    public static void main(String[] args) {
        System.out.println("-----------------Abstract class task1------------------------");
        BookStation bookStation = new BookStation();
        bookStation.getBook();

        System.out.println("-----------------Abstract class task2------------------------");
        FindPG findPG = new FindPG();
        findPG.getPG();

        System.out.println("-----------------Abstract class task3------------------------");
        Automobile automobile = new Automobile();
        automobile.getCar();
        automobile.priceOfCar();

        System.out.println("-----------------Abstract class task4------------------------");
        BMTC bmtc = new BMTC("Rajaji Nagar","M G Road" , 40);
        bmtc.display();

        System.out.println("-----------------Abstract class task5------------------------");
        NammaMetro nammaMetro = new NammaMetro("M G Road","Rajaji Nagar",80,"green Line");
        nammaMetro.display();

    }
}
