package com.java.xworkz.Camera;

public class Camera {


    private String brand;
    private int price;
    private Type type;

    private String connectivity;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setType(Type type){
        this.type=type;
    }
    public void setConnectivity(String connectivity){
        this.connectivity=connectivity;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getPrice(){
        return this.price;
    }

    public Type getType(){
        return this.type;
    }

    public String getConnectivity(){
        return this.connectivity;
    }

}
