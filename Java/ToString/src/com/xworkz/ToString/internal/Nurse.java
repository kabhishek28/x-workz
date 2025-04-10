package com.xworkz.ToString.internal;

public class Nurse {
    private String name;
    private int experienceYears;
    private String department;

    public Nurse(String name, int experienceYears, String department) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Nurse: " + name + ", Experience: " + experienceYears + " years, Department: " + department;
    }
}
