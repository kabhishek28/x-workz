package com.xworkz.ToString.internal;

public class Startup {
    private String name;
    private String founder;
    private int yearFounded;

    public Startup(String name, String founder, int yearFounded) {
        this.name = name;
        this.founder = founder;
        this.yearFounded = yearFounded;
    }

    @Override
    public String toString() {
        return "Startup: " + name + ", Founder: " + founder + ", Founded in: " + yearFounded;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}
