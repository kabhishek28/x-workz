package com.xworkz.ToString.internal;

public class MusicPlayer {

        private String songTitle;
        private String artist;
        private int duration;

        public MusicPlayer(String songTitle, String artist, int duration) {
            this.songTitle = songTitle;
            this.artist = artist;
            this.duration = duration;
        }

        @Override
        public String toString() {
            return "Now Playing: " + songTitle + " by " + artist + ", Duration: " + duration + " secs";
        }
    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof MusicPlayer) {
                MusicPlayer other = (MusicPlayer) object;
                if (this.artist.equals(other.artist) ) {
                    return true;
                }
            }
        }
        return false;
    }

}
