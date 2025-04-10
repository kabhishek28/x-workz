package com.xworkz.ToString.internal;

public class Movie {


        private String title;
        private String genre;
        private int duration;

        public Movie(String title, String genre, int duration) {
            this.title = title;
            this.genre = genre;
            this.duration = duration;
        }

        @Override
        public String toString() {
            return "Title: " + title + ", Genre: " + genre + ", Duration: " + duration + " mins";
        }


}
