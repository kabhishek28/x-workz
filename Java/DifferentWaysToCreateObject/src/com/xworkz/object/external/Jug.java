package com.xworkz.object.external;

public class Jug implements Cloneable {
    String color;
    int price;

    public Jug(String color,int price){
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void display(){
        System.out.println("Color : " + this.color);
        System.out.println("Price : " + this.price);
    }

    public void jugPrince(){
        System.out.println("price of the Jug is 250.Rs");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}