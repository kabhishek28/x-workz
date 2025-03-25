package com.java.xworkz.Idcard;

public class IDCard {
    private String material;
    private String[] colors;
    private int weight;
    private String designedBy;

    public void setMaterial(String material){
        this.material = material;
    }

    public void setColors(String[] colors){
        this.colors=colors;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    public void setDesignedBy(String designedBy){
        this.designedBy=designedBy;
    }


    public String getMaterial(){
        return this.material;
    }

    public String[] getColors(){
        return this.colors;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getDesignedBy(){
        return this.designedBy;
    }
}
