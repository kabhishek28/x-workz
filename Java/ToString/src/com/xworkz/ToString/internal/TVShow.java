package com.xworkz.ToString.internal;

public class TVShow {
    private String title;
    private String genre;
    private int seasons;

    public TVShow(String title, String genre, int seasons) {
        this.title = title;
        this.genre = genre;
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return "TV Show: " + title + ", Genre: " + genre + ", Seasons: " + seasons;
    }
    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof TVShow) {
                TVShow other = (TVShow) object;
                if (this.title.equals(other.title) &&
                        this.genre.equals(other.genre) &&
                        this.seasons == other.seasons) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner

