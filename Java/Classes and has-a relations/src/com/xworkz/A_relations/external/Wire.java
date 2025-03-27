package com.xworkz.A_relations.external;

import com.xworkz.A_relations.internal.Quality;

public class Wire {

    private int noOfWire;
    private String typeOfWire;

    public void setNoOfWire(int noOfWire) {
        this.noOfWire = noOfWire;
    }
    public void setTypeOfWire(String typeOfWire) {
        this.typeOfWire = typeOfWire;
    }
    public int getNoOfWire() {
        return noOfWire;
    }
    public String getTypeOfWire() {
        return typeOfWire;
    }

    public void getQuality(Quality quality){
        quality.setBrand("ISI");
        quality.setWireLength(2);
        System.out.println("Wire Brand name :"+quality.getBrand());
        System.out.println("Wire length :"+quality.getWireLength()+"m");

    }


}
