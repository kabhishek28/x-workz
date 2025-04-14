package com.xworkz.ToString.internal;

public class Furniture {
    private String type;
    private String material;
    private double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture: " + type + ", Material: " + material + ", Price: ₹" + price;
    }
    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Furniture) {
                Furniture other = (Furniture) object;
                if (this.type.equals(other.type) &&
                        this.material.equals(other.material) &&
                        this.price == other.price) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner

