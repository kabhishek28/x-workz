package com.xworkz.ToString.internal;

public class MusicPlaylist {
    private String name;
    private String genre;
    private int numberOfSongs;

    public MusicPlaylist(String name, String genre, int numberOfSongs) {
        this.name = name;
        this.genre = genre;
        this.numberOfSongs = numberOfSongs;
    }

    @Override
    public String toString() {
        return "Playlist: " + name + ", Genre: " + genre + ", Songs: " + numberOfSongs;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner

