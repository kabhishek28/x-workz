package com.xworkz.ToString.internal;

public class BloodDonor {
    private String name;
    private String bloodGroup;
    private int donations;

    public BloodDonor(String name, String bloodGroup, int donations) {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.donations = donations;
    }

    @Override
    public String toString() {
        return "Donor: " + name + ", Blood Group: " + bloodGroup + ", Donations: " + donations;
    }
}

    // Runner
