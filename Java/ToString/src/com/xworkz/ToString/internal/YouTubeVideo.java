package com.xworkz.ToString.internal;

public class YouTubeVideo {

        private String title;
        private String creator;
        private int views;

        public YouTubeVideo(String title, String creator, int views) {
            this.title = title;
            this.creator = creator;
            this.views = views;
        }

        @Override
        public String toString() {
            return "Video Title: " + title + ", Creator: " + creator + ", Views: " + views;
        }
    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof YouTubeVideo) {
                YouTubeVideo other = (YouTubeVideo) object;
                if (this.creator.equals(other.creator) ) {
                    return true;
                }
            }
        }
        return false;
    }

}
