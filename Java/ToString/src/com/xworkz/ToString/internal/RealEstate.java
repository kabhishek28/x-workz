package com.xworkz.ToString.internal;

public class RealEstate {
    private String propertyType;
    private String location;
    private double price;

    public RealEstate(String propertyType, String location, double price) {
        this.propertyType = propertyType;
        this.location = location;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Property: " + propertyType + ", Location: " + location + ", Price: ₹" + price;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}
