package com.xworkz.object.external;

import java.io.Serializable;

public class Bucket implements Serializable {
    String color;
    int price;

    public Bucket(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public void display(){
        System.out.println("Color : " + this.color + " : Price : " + this.price);
    }
}
