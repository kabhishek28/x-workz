package com.xworkz.ToString.internal;

public class Painting {
    private String title;
    private String artist;
    private int year;

    public Painting(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Painting: '" + title + "' by " + artist + ", Year: " + year;
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Painting) {
                Painting other = (Painting) object;
                if (this.title.equals(other.title) &&
                        this.artist.equals(other.artist) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
