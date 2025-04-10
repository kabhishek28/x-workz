package com.xworkz.ToString.internal;

public class TheatreShow {
    private String showName;
    private String language;
    private String time;

    public TheatreShow(String showName, String language, String time) {
        this.showName = showName;
        this.language = language;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Show: " + showName + ", Language: " + language + ", Time: " + time;
    }
}
