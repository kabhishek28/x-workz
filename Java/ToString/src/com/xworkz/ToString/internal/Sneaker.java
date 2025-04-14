package com.xworkz.ToString.internal;

public class Sneaker {
    private String brand;
    private String color;
    private int size;

    public Sneaker(String brand, String color, int size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Sneaker: " + brand + ", Color: " + color + ", Size: " + size;
    }
    @Override
    public int hashCode(){
        return 4;
    }
    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Sneaker) {
                Sneaker other = (Sneaker) object;
                if (this.brand.equals(other.brand) &&
                        this.color.equals(other.color) &&
                        this.size == other.size) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner

