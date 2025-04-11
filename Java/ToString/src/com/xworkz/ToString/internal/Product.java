package com.xworkz.ToString.internal;

public class Product {
    private String name;
    private String category;
    private int stock;

    public Product(String name, String category, int stock) {
        this.name = name;
        this.category = category;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Category: " + category + ", In Stock: " + stock;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}
