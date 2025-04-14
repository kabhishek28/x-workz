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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof TattooArtist) {
                TattooArtist other = (TattooArtist) object;
                if (this.name.equals(other.name) &&
                        this.style.equals(other.style) &&
                        this.completedTattoos == other.completedTattoos) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
