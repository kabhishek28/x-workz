package com.xworkz.ToString.internal;
public class TattooArtist {
    private String name;
    private String style;
    private int completedTattoos;

    public TattooArtist(String name, String style, int completedTattoos) {
        this.name = name;
        this.style = style;
        this.completedTattoos = completedTattoos;
    }

    @Override
    public String toString() {
        return "Tattoo Artist: " + name + ", Style: " + style + ", Tattoos: " + completedTattoos;
    }
}

    // Runner
