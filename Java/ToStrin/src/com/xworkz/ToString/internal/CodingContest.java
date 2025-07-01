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
}

    // Runner
