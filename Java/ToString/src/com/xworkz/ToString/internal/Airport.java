package com.xworkz.ToString.internal;

public class Airport {
    private String name;
    private String city;
    private int terminals;

    public Airport(String name, String city, int terminals) {
        this.name = name;
        this.city = city;
        this.terminals = terminals;
    }

    @Override
    public String toString() {
        return "Airport: " + name + ", City: " + city + ", Terminals: " + terminals;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}
