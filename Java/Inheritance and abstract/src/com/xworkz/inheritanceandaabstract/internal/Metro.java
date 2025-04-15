package com.xworkz.inheritanceandaabstract.internal;

public abstract class Metro {
    private String picUpPoint;
    private String dropPoint;
    private int ticketPrice;
    private String whichLine;

    public Metro(String picUpPoint, String dropPoint, int ticketPrice, String whichLine) {
        this(dropPoint,ticketPrice,whichLine);
        this.picUpPoint = picUpPoint;
    }

    public Metro(String dropPoint, int ticketPrice, String whichLine) {
        this(whichLine,ticketPrice);
        this.dropPoint = dropPoint;

    }

    public Metro( String whichLine,int ticketPrice) {
        this(ticketPrice);
        this.whichLine = whichLine;
    }

    public Metro(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void display(){
        System.out.println("pickUp point :"+picUpPoint);
        System.out.println("drop point :"+dropPoint);
        System.out.println("ticket Price :"+ticketPrice);
        System.out.println("whichLine :"+whichLine);

    }
}
