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
}

    // Runner

