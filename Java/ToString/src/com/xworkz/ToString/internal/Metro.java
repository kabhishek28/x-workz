package com.xworkz.ToString.internal;

public class Metro {
    private String pickUpPoint;
    private String dropPoint;
    private  int price;

    public Metro(String pickUpPoint, String dropPoint, int price) {
        this.pickUpPoint = pickUpPoint;
        this.dropPoint = dropPoint;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Pick Up Point"+pickUpPoint +" Drop point" + dropPoint + "price "+price;
    }
    @Override
    public int hashCode(){
        return 4;
    }
}
