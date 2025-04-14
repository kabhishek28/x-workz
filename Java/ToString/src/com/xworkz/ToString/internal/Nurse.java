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
    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Nurse) {
                Nurse other = (Nurse) object;
                if (this.name.equals(other.name) &&
                        this.experienceYears == other.experienceYears) {
                    return true;
                }
            }
        }
        return false;
    }
}
