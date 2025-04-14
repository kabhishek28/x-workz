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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof BloodDonor) {
                BloodDonor other = (BloodDonor) object;
                if (this.name.equals(other.name) &&
                        this.bloodGroup.equals(other.bloodGroup) &&
                        this.donations == other.donations) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
