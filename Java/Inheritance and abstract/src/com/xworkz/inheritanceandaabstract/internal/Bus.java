package com.xworkz.inheritanceandaabstract.internal;

public abstract class Bus {
    private String picUpPoint;
    private String dropPoint;
    private int ticketPrice;

    public Bus(String picUpPoint, String dropPoint, int ticketPrice) {
        this.picUpPoint = picUpPoint;
        this.dropPoint = dropPoint;
        this.ticketPrice = ticketPrice;
    }

    public void display(){
        System.out.println("pickUp point :"+picUpPoint);
        System.out.println("drop point :"+dropPoint);
        System.out.println("ticket Price :"+ticketPrice);
    }
}
