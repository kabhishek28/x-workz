package com.java.xworkz.Satellite;

public class StationRunner {
    public static void main(String[] args) {


        Satellite satellite1 = new Satellite();
        satellite1.setType(Type.GEO);
        satellite1.setCost(25000);
        satellite1.setWeight(250);
        satellite1.setLoadCapacity(100);

        Satellite satellite2 = new Satellite();
        //satellite2.setType(Type.valueOf("Abhi"));
        satellite2.setCost(35000);
        satellite2.setWeight(350);
        satellite2.setLoadCapacity(000);

        Satellite satellite3 = new Satellite();
        satellite3.setType(Type.LEO);
        satellite3.setCost(5000);
        satellite3.setWeight(50);
        satellite3.setLoadCapacity(25);

        Satellite satellite4 = new Satellite();
        satellite4.setType(Type.GTO);
        satellite4.setCost(100000);
        satellite4.setWeight(600);
        satellite4.setLoadCapacity(300);

        Satellite satellite5 = new Satellite();
        satellite5.setType(Type.MEO);
        satellite5.setCost(50000);
        satellite5.setWeight(500);
        satellite5.setLoadCapacity(50);

        Satellite satellite6 = new Satellite();
        satellite6.setType(Type.SSO);
        satellite6.setCost(60000);
        satellite6.setWeight(450);
        satellite6.setLoadCapacity(900);

        Satellite[] satellites = {satellite1,satellite2,satellite3,satellite4,satellite5,satellite6};

        Station station = new Station();
        station.getSatellite(satellites);
    }

}
