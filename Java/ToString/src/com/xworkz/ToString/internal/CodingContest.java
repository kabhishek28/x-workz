package com.xworkz.ToString.internal;

public class CodingContest {
    private String contestName;
    private String platform;
    private int durationHours;

    public CodingContest(String contestName, String platform, int durationHours) {
        this.contestName = contestName;
        this.platform = platform;
        this.durationHours = durationHours;
    }

    @Override
    public String toString() {
        return "Contest: " + contestName + ", Platform: " + platform + ", Duration: " + durationHours + " hrs";
    }


    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof CodingContest) {
                CodingContest other = (CodingContest) object;
                if (this.contestName.equals(other.contestName) &&
                        this.platform.equals(other.platform) &&
                        this.durationHours == other.durationHours) {
                    return true;
                }
            }
        }
        return false;
    }
}


