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


}
