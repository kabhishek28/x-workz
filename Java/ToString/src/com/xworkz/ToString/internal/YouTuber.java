package com.xworkz.ToString.internal;

public class YouTuber {
    private String name;
    private String niche;
    private int videos;

    public YouTuber(String name, String niche, int videos) {
        this.name = name;
        this.niche = niche;
        this.videos = videos;
    }

    @Override
    public String toString() {
        return "YouTuber: " + name + ", Niche: " + niche + ", Videos: " + videos;
    }
    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof YouTuber) {
                YouTuber other = (YouTuber) object;
                if (this.name.equals(other.name) &&
                        this.niche.equals(other.niche) &&
                        this.videos == other.videos) {
                    return true;
                }
            }
        }
        return false;
    }
}


