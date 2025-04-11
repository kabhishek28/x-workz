package com.xworkz.ToString.internal;

public class TrailWeather {
    private String trailName;
    private String season;
    private String expectedWeather;

    public TrailWeather(String trailName, String season, String expectedWeather) {
        this.trailName = trailName;
        this.season = season;
        this.expectedWeather = expectedWeather;
    }

    @Override
    public String toString() {
        return "Trail: " + trailName + ", Season: " + season + ", Weather: " + expectedWeather;
    }
    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner
