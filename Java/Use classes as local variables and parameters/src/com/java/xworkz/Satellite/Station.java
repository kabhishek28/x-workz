package com.java.xworkz.Satellite;

public class Station {

    public void getSatellite(Satellite[] satellites){
        if(satellites != null) {

            for(Satellite satellite:satellites) {


                System.out.println("calling all get methods");
                System.out.println(satellite.getType());
                System.out.println(satellite.getCost());
                System.out.println(satellite.getWeight());
                System.out.println(satellite.getLoadCapacity());
            }
        }else{
            System.out.println("satellites is null");
        }

    }
}
