package com.xworkz.ToString.internal;

public class PodcastEpisode {
    private String title;
    private String host;
    private int duration;

    public PodcastEpisode(String title, String host, int duration) {
        this.title = title;
        this.host = host;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Podcast: " + title + ", Host: " + host + ", Duration: " + duration + " min";
    }
}
