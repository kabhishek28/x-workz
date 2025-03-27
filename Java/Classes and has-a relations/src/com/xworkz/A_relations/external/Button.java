package com.xworkz.A_relations.external;

import com.xworkz.A_relations.internal.Material;

public class Button {
    private String typeOfButton;
    private int noOfButton;

    public void setTypeOfButton(String typeOfButton) {
        this.typeOfButton = typeOfButton;
    }

    public void setNoOfButton(int noOfButton) {
        this.noOfButton = noOfButton;
    }

    public String getTypeOfButton() {
        return typeOfButton;
    }

    public int getNoOfButton() {
        return noOfButton;
    }



    public void getMaterial(Material material){
        material.setBrand("Bajaj");
        material.setType("fiber");
        System.out.println("Brand :"+material.getBrand());
        System.out.println("Material :"+material.getType());
    }
}
