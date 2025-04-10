package com.xworkz.ToString.internal;

public class Singer {
    private String name;
    private String genre;
    private int albumsReleased;

    public Singer(String name, String genre, int albumsReleased) {
        this.name = name;
        this.genre = genre;
        this.albumsReleased = albumsReleased;
    }

    @Override
    public String toString() {
        return "Singer: " + name + ", Genre: " + genre + ", Albums: " + albumsReleased;
    }
}
