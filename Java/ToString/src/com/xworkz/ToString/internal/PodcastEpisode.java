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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof PodcastEpisode) {
                PodcastEpisode other = (PodcastEpisode) object;
                if (this.title.equals(other.title) &&
                        this.host.equals(other.host) &&
                        this.duration == other.duration) {
                    return true;
                }
            }
        }
        return false;
    }
}
