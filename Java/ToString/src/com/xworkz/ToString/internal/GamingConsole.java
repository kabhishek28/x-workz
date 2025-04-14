package com.xworkz.ToString.internal;

public class GamingConsole {
    private String brand;
    private String model;
    private int storage;

    public GamingConsole(String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Console: " + brand + " " + model + ", Storage: " + storage + "GB";
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof GamingConsole) {
                GamingConsole other = (GamingConsole) object;
                if (this.brand.equals(other.brand) &&
                        this.model.equals(other.model) &&
                        this.storage == other.storage) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
