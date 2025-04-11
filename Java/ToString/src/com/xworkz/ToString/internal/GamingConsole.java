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
}

    // Runner
