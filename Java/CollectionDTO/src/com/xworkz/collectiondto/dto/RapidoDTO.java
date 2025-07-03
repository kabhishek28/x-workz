package com.xworkz.collectiondto.dto;

public class RapidoDTO {



        private String name;
        private String source;
        private String destination;
        private int noOfPeople;
        private double price;
        private boolean helmetProvided;
        private float distanceInKm;

        // You can add constructors, getters, setters, toString(), etc. if needed.


    public RapidoDTO(String name, String source, String destination, int noOfPeople, double price, boolean helmetProvided, float distanceInKm) {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.noOfPeople = noOfPeople;
        this.price = price;
        this.helmetProvided = helmetProvided;
        this.distanceInKm = distanceInKm;
    }

    @Override
    public String toString() {
        return "RapidoDTO{" +
                "name='" + name + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", noOfPeople=" + noOfPeople +
                ", price=" + price +
                ", helmetProvided=" + helmetProvided +
                ", distanceInKm=" + distanceInKm +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHelmetProvided() {
        return helmetProvided;
    }

    public void setHelmetProvided(boolean helmetProvided) {
        this.helmetProvided = helmetProvided;
    }

    public float getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(float distanceInKm) {
        this.distanceInKm = distanceInKm;
    }
}
